package com.helloarron.ysjinfoapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.helloarron.ysjinfoapplication.R;
import com.helloarron.ysjinfoapplication.bean.UserBean;

import java.util.List;

/**
 * Created by arron on 16/9/11.
 */
public class UserAdapter extends BaseAdapter {

    private List<UserBean> mList;
    private LayoutInflater layoutInflater;

    public UserAdapter(Context context, List<UserBean> userBeanList) {
        this.mList = userBeanList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_user, null);
            viewHolder.title = (TextView) convertView.findViewById(R.id.tv_username);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        UserBean bean = mList.get(position);
        viewHolder.title.setText(bean.getUsername());

        return convertView;
    }

    class ViewHolder {
        public TextView title;
    }
}
