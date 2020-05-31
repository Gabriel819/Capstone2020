package com.example.membertest.cabinet;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cabinet implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cabinet_idx;

    @Column(name = "CABINET_NAME")
    private String cabinet_name;

    @Column(name = "LATITUDE")
    private double latitude;

    @Column(name = "LONGITUDE")
    private double longitude;

    public void setCabinet_idx(int cabinet_idx){
        this.cabinet_idx = cabinet_idx;
    }

    public void setCabinet_name(String cabinet_name){
        this.cabinet_name = cabinet_name;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public int getCabinet_idx(){
        return cabinet_idx;
    }

    public String getCabinet_name(){
        return cabinet_name;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }
}
