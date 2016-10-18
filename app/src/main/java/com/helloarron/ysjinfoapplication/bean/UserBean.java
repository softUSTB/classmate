package com.helloarron.ysjinfoapplication.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by arron on 16/9/11.
 */
public class UserBean implements Parcelable {

    private int id;
    private String num;
    private String username;
    private int sex;
    private String birthDate;
    private String politicalLandscape;
    private String major;
    private String tutor;
    private String phone;
    private String homePhone;
    private String email;
    private String dormitory;
    private String wechat;
    private String qq;
    private String homeAddress;
    private String card;
    private String nation;
    private String isFaith;
    private String origin;
    private String admCategory;
    private String graduatedAddress;
    private String isMarriage;
    private String remark;
    private String classX;

    public UserBean(Parcel in) {
        id = in.readInt();
        num = in.readString();
        username = in.readString();
        sex = in.readInt();
        birthDate = in.readString();
        politicalLandscape = in.readString();
        major = in.readString();
        tutor = in.readString();
        phone = in.readString();
        homePhone = in.readString();
        email = in.readString();
        dormitory = in.readString();
        wechat = in.readString();
        qq = in.readString();
        homeAddress = in.readString();
        card = in.readString();
        nation = in.readString();
        isFaith = in.readString();
        origin = in.readString();
        admCategory = in.readString();
        graduatedAddress = in.readString();
        isMarriage = in.readString();
        remark = in.readString();
        classX = in.readString();
    }

    public static final Creator<UserBean> CREATOR = new Creator<UserBean>() {
        @Override
        public UserBean createFromParcel(Parcel in) {
            return new UserBean(in);
        }

        @Override
        public UserBean[] newArray(int size) {
            return new UserBean[size];
        }
    };

    public UserBean() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPoliticalLandscape() {
        return politicalLandscape;
    }

    public void setPoliticalLandscape(String politicalLandscape) {
        this.politicalLandscape = politicalLandscape;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIsFaith() {
        return isFaith;
    }

    public void setIsFaith(String isFaith) {
        this.isFaith = isFaith;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getAdmCategory() {
        return admCategory;
    }

    public void setAdmCategory(String admCategory) {
        this.admCategory = admCategory;
    }

    public String getGraduatedAddress() {
        return graduatedAddress;
    }

    public void setGraduatedAddress(String graduatedAddress) {
        this.graduatedAddress = graduatedAddress;
    }

    public String getIsMarriage() {
        return isMarriage;
    }

    public void setIsMarriage(String isMarriage) {
        this.isMarriage = isMarriage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(num);
        dest.writeString(username);
        dest.writeInt(sex);
        dest.writeString(birthDate);
        dest.writeString(politicalLandscape);
        dest.writeString(major);
        dest.writeString(tutor);
        dest.writeString(phone);
        dest.writeString(homePhone);
        dest.writeString(email);
        dest.writeString(dormitory);
        dest.writeString(wechat);
        dest.writeString(qq);
        dest.writeString(homeAddress);
        dest.writeString(card);
        dest.writeString(nation);
        dest.writeString(isFaith);
        dest.writeString(origin);
        dest.writeString(admCategory);
        dest.writeString(graduatedAddress);
        dest.writeString(isMarriage);
        dest.writeString(remark);
        dest.writeString(classX);
    }
}
