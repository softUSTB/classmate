package com.helloarron.ysjinfoapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.helloarron.ysjinfoapplication.activity.UserInfoActivity;
import com.helloarron.ysjinfoapplication.adapter.UserAdapter;
import com.helloarron.ysjinfoapplication.bean.UserBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lvUsers;
    private List<UserBean> userListBean;
    private static String URL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.app_name);

        lvUsers = (ListView) findViewById(R.id.lv_users);
        new UsersAsyncTask().execute(URL);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "id:"+String.valueOf(userListBean.get(position).getId()), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("userInfo", userListBean.get(position));
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * 实现网络异步访问
     */
    private class UsersAsyncTask extends AsyncTask<String, Void, List<UserBean>> {

        @Override
        protected List<UserBean> doInBackground(String... params) {
            return getJsonData(params[0]);
        }

        @Override
        protected void onPostExecute(List<UserBean> userBeen) {
            super.onPostExecute(userBeen);
            UserAdapter adapter = new UserAdapter(MainActivity.this, userListBean);
            lvUsers.setAdapter(adapter);
            lvUsers.setOnItemClickListener(MainActivity.this);
        }
    }

    /**
     * 将加载的json数据转为封装的newsBeanList
     *
     * @param url
     * @return
     */
    private List<UserBean> getJsonData(String url) {
        userListBean = new ArrayList<>();
        try {
            String jsonString = readSteam(new URL(url).openStream());
            JSONObject jsonObject;
            UserBean userBean;
            try {
                jsonObject = new JSONObject(jsonString);
                JSONArray jsonArray = jsonObject.getJSONArray("users");
                for (int i = 0; i < jsonArray.length(); i++) {
                    jsonObject = jsonArray.getJSONObject(i);
                    userBean = new UserBean();
                    userBean.setId(Integer.parseInt(jsonObject.getString("id")));
                    userBean.setNum(jsonObject.getString("num"));
                    userBean.setUsername(jsonObject.getString("username"));
                    userBean.setSex(Integer.parseInt(jsonObject.getString("sex")));
                    userBean.setBirthDate(jsonObject.getString("birthdate"));
                    userBean.setPoliticalLandscape(jsonObject.getString("political_landscape"));
                    userBean.setMajor(jsonObject.getString("major"));
                    userBean.setTutor(jsonObject.getString("tutor"));
                    userBean.setPhone(jsonObject.getString("phone"));
                    userBean.setHomePhone(jsonObject.getString("home_phone"));
                    userBean.setEmail(jsonObject.getString("email"));
                    userBean.setDormitory(jsonObject.getString("dormitory"));
                    userBean.setWechat(jsonObject.getString("wechat"));
                    userBean.setQq(jsonObject.getString("qq"));
                    userBean.setHomeAddress(jsonObject.getString("homea_ddress"));
                    userBean.setCard(jsonObject.getString("card"));
                    userBean.setNation(jsonObject.getString("nation"));
                    userBean.setIsFaith(jsonObject.getString("is_faith"));
                    userBean.setOrigin(jsonObject.getString("origin"));
                    userBean.setAdmCategory(jsonObject.getString("adm_category"));
                    userBean.setGraduatedAddress(jsonObject.getString("graduated_ddress"));
                    userBean.setIsMarriage(jsonObject.getString("is_marriage"));
                    userBean.setRemark(jsonObject.getString("remark"));
                    userBean.setClassX(jsonObject.getString("class"));
                    userListBean.add(userBean);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userListBean;
    }

    /**
     * 解析网页数据流存入一个字符串中
     *
     * @param is
     * @return
     */
    private String readSteam(InputStream is) {
        InputStreamReader isr;
        String result = "";
        try {
            String line = "";
            isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                result += line;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
