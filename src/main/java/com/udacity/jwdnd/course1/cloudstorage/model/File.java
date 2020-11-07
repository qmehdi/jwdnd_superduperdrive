package com.udacity.jwdnd.course1.cloudstorage.model;

import java.sql.Timestamp;

public class File {
    private Integer fileId;
    private String filename;
    private String contenttype;
    private String filesize;
    private String userid;
    private byte[] filedata;
    private String uploadedtime;

    public File(String filename, String contenttype, String filesize, String userid, byte[] filedata, String uploadedtime) {
        this.filename = filename;
        this.contenttype = contenttype;
        this.filesize = filesize;
        this.userid = userid;
        this.filedata = filedata;
        this.uploadedtime = uploadedtime;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public byte[] getFiledata() {
        return filedata;
    }

    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }

    public String getUploadedtime() { return uploadedtime; }

    public void setUploadedtime(String uploadedtime) { this.uploadedtime = uploadedtime; }
}
