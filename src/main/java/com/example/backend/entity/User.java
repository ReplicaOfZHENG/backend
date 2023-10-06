package com.example.backend.entity;

import lombok.Getter;

@Getter
public class User {
    private int type;
    private String user;
    private String pwd;

    public void setType(int type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "type=" + type +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
