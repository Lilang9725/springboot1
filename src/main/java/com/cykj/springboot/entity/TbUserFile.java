package com.cykj.springboot.entity;


public class TbUserFile {

    private long ufId;
    private long fileId;
    private long userId;
    private String upladTime;
    private long downloadCount;
    private long fileStateId;
    private String fileMessage;
    private String fileUserPath;
    private String remark;

    public TbUserFile() {
    }

    public long getUfId() {
        return ufId;
    }

    public void setUfId(long ufId) {
        this.ufId = ufId;
    }


    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }


    public String getUpladTime() {
        return upladTime;
    }

    public void setUpladTime(String upladTime) {
        this.upladTime = upladTime;
    }


    public long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(long downloadCount) {
        this.downloadCount = downloadCount;
    }


    public long getFileStateId() {
        return fileStateId;
    }

    public void setFileStateId(long fileStateId) {
        this.fileStateId = fileStateId;
    }


    public String getFileMessage() {
        return fileMessage;
    }

    public void setFileMessage(String fileMessage) {
        this.fileMessage = fileMessage;
    }


    public String getFileUserPath() {
        return fileUserPath;
    }

    public void setFileUserPath(String fileUserPath) {
        this.fileUserPath = fileUserPath;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
