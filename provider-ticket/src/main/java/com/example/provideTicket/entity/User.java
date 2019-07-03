package com.example.provideTicket.entity;

import lombok.Data;

/**
 * @author: yan
 * @Date: 2019/7/3/0003 23:21
 * @Description:
 */
public class User {

    private  String id;
    private String userName;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
