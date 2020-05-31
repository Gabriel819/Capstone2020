package com.example.membertest.rent;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rent implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx;

    @Column(name = "CABINET_IDX")
    private int cabinet_idx;

    @Column(name = "USER_IDX")
    private int user_idx;

    @Column(name = "START_TIME")
    private String start_time;

    @Column(name = "END_TIME")
    private String end_time;

    @Column(name = "IMAGE")
    private String image;

    public void setUser_idx(int user_idx) {
        this.user_idx = user_idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setCabinet_idx(int cabinet_idx) {
        this.cabinet_idx = cabinet_idx;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdx(){
        return idx;
    }

    public int getCabinet_idx(){
        return cabinet_idx;
    }

    public int getUser_idx(){
        return user_idx;
    }

    public String getStart_time(){
        return start_time;
    }

    public String getEnd_time(){
        return end_time;
    }

    public String getImage(){
        return image;
    }
}