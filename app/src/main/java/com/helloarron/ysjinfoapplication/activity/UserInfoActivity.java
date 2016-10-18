package com.helloarron.ysjinfoapplication.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.TextView;

import com.helloarron.ysjinfoapplication.R;
import com.helloarron.ysjinfoapplication.bean.UserBean;

public class UserInfoActivity extends AppCompatActivity {

    private UserBean userBean;
    private RadioButton rbMale, rbFemale;
    private TextView tvNum, tvUsername, tvBirthDate, tvCard, tvOrigin, tvAdmCategory, tvGraduatedAddress, tvIsMarriage, tvPoliticalLandscape, tvNation, tvIsFaith, tvMajor, tvTutor, tvPhone, tvHomePhone, tvEmail, tvDormitory, tvWechat, tvQq, tvHomeAddress, tvRemark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        userBean = (UserBean) getIntent().getParcelableExtra("userInfo");

        initView();
        addDataToView();
    }

    /**
     * 初始化视图控件
     */
    private void initView() {
        tvNum = (TextView) findViewById(R.id.tv_num);
        tvUsername = (TextView) findViewById(R.id.tv_username);
        rbMale = (RadioButton) findViewById(R.id.radio_male);
        rbFemale = (RadioButton) findViewById(R.id.radio_female);
        tvBirthDate = (TextView) findViewById(R.id.tv_birthdate);
        tvCard = (TextView) findViewById(R.id.tv_card);
        tvOrigin = (TextView) findViewById(R.id.tv_origin);
        tvAdmCategory = (TextView) findViewById(R.id.tv_adm_category);
        tvGraduatedAddress = (TextView) findViewById(R.id.tv_graduated_ddress);
        tvIsMarriage = (TextView) findViewById(R.id.tv_is_marriage);
        tvPoliticalLandscape = (TextView) findViewById(R.id.tv_political_landscape);
        tvNation = (TextView) findViewById(R.id.tv_nation);
        tvIsFaith = (TextView) findViewById(R.id.tv_is_faith);
        tvMajor = (TextView) findViewById(R.id.tv_major);
        tvTutor = (TextView) findViewById(R.id.tv_tutor);
        tvPhone = (TextView) findViewById(R.id.tv_phone);
        tvHomePhone = (TextView) findViewById(R.id.tv_home_phone);
        tvEmail = (TextView) findViewById(R.id.tv_email);
        tvDormitory = (TextView) findViewById(R.id.tv_dormitory);
        tvWechat = (TextView) findViewById(R.id.tv_wechat);
        tvQq = (TextView) findViewById(R.id.tv_qq);
        tvHomeAddress = (TextView) findViewById(R.id.tv_home_address);
        tvRemark = (TextView) findViewById(R.id.tv_remark);
    }

    /**
     * 添加数据到视图中
     */
    private void addDataToView() {
        tvNum.setText(userBean.getNum().toString());
        tvUsername.setText(userBean.getUsername().toString());
        if (userBean.getSex() == 1) {
            rbMale.setChecked(true);
            rbFemale.setChecked(false);
        } else if (userBean.getSex() == 2) {
            rbMale.setChecked(false);
            rbFemale.setChecked(true);
        }
        tvBirthDate.setText(userBean.getBirthDate().toString());
        tvCard.setText(userBean.getCard().toString());
        tvOrigin.setText(userBean.getOrigin().toString());
        tvAdmCategory.setText(userBean.getAdmCategory().toString());
        tvGraduatedAddress.setText(userBean.getGraduatedAddress().toString());
        tvIsMarriage.setText(userBean.getIsMarriage().toString());
        tvPoliticalLandscape.setText(userBean.getPoliticalLandscape().toString());
        tvNation.setText(userBean.getNation().toString());
        tvIsFaith.setText(userBean.getIsFaith().toString());
        tvMajor.setText(userBean.getMajor().toString());
        tvTutor.setText(userBean.getTutor().toString());
        tvPhone.setText(userBean.getPhone().toString());
        tvHomePhone.setText(userBean.getHomePhone().toString());
        tvEmail.setText(userBean.getEmail().toString());
        tvDormitory.setText(userBean.getDormitory().toString());
        tvWechat.setText(userBean.getWechat().toString());
        tvQq.setText(userBean.getQq().toString());
        tvHomeAddress.setText(userBean.getHomeAddress().toString());
        tvRemark.setText(userBean.getRemark().toString());
    }
}
