package com.cykj.springboot.entity;

public class TbLog {
    private long logId;
    private String operate;
    private long param;
    private long userId;
    private String logTime;
    private String remark;
    private UserList user;

    public TbLog() {
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public long getParam() {
        return param;
    }

    public void setParam(long param) {
        this.param = param;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setUser(UserList user) {
        this.user = user;
    }

    public UserList getUser() {
        return user;
    }
}
