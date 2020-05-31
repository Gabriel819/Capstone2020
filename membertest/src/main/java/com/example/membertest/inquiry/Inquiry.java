package com.example.membertest.inquiry;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inquiry implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;

    @Column(name = "REQUEST_DATE")
    private String request_date;

    @Column(name = "USER_IDX")
    private int user_idx;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "REQUEST_IMAGE")
    private String request_image;

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    public void setRequest_image(String request_image) {
        this.request_image = request_image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public int getIdx(){
        return idx;
    }

    public String getRequest_date() {
        return request_date;
    }

    public int getUser_idx(){
        return user_idx;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public String getRequest_image(){
        return request_image;
    }
}