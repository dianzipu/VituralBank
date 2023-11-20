package com.example.springboottrain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("client_all_account")
public class User {
    @TableField(value = "id")
    private int id;
    @TableField(value = "user_account")
    private String user_account;
    @TableField(value = "user_password")
    private String user_password;
    @TableField(value = "user_id_encrypt")
    private String user_email;
    @TableField(value = "user_credit")
    private float user_credit;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_account='" + user_account + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_credit=" + user_credit +
                '}';
    }

    public User(int id, String user_account, String user_password, String user_email, float user_credit) {
        this.id = id;
        this.user_account = user_account;
        this.user_password = user_password;
        this.user_email = user_email;
        this.user_credit = user_credit;
    }


    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_credit(float user_credit) {
        this.user_credit = user_credit;
    }

    public float getUser_credit() {
        return user_credit;
    }
}
