package com.cykj.springboot.entity;

import java.util.List;

public class UserList {
    private long userId;
    private String userLoginId;
    private String userLoginPassword;
    private String userName;
    private String userGender;
    private String userState;
    private long educationId;
    private long professionId;
    private String mobile;
    private String eMail;
    private long integral;
    private String remark;
    private List<?> list;
    private TbUserFile tbUserFile;

    public UserList() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserLoginPassword() {
        return userLoginPassword;
    }

    public void setUserLoginPassword(String userLoginPassword) {
        this.userLoginPassword = userLoginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public long getEducationId() {
        return educationId;
    }

    public void setEducationId(long educationId) {
        this.educationId = educationId;
    }

    public long getProfessionId() {
        return professionId;
    }

    public void setProfessionId(long professionId) {
        this.professionId = professionId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public long getIntegral() {
        return integral;
    }

    public void setIntegral(long integral) {
        this.integral = integral;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public List<?> getList() {
        return list;
    }

    public void setTbUserFile(TbUserFile tbUserFile) {
        this.tbUserFile = tbUserFile;
    }

    public TbUserFile getTbUserFile() {
        return tbUserFile;
    }
}
