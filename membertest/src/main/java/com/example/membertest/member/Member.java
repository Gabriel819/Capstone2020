package com.example.membertest.member;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_idx;

    @Column(name = "USER_NAME")
    private String user_name;

    @Column(name = "USER_PHONE")
    private String user_phone;

    @Column(name = "USER_EMAIL")
    private String user_email;

    @Column(name = "USER_ID", nullable = false)
    private String user_id;

    @Column(name = "USER_PW")
    private String user_pw;

    @Column(name = "USER_GENDER")
    private String user_gender;

    @Column(name = "USER_NICKNAME")
    private String user_nickname;

    @Column(name = "STAMP")
    private int stamp;

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public int getUser_idx(){
        return user_idx;
    }

    public String getUser_name(){
        return user_name;
    }

    public String getUser_phone(){
        return user_phone;
    }

    public String getUser_email(){
        return user_email;
    }

    public String getUser_id(){
        return user_id;
    }

    public String getUser_pw(){
        return user_pw;
    }

    public String getUser_gender(){
        return user_gender;
    }

    public String getUser_nickname(){
        return user_nickname;
    }

    public int getStamp(){
        return stamp;
    }
}
