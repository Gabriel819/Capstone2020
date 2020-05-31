package com.example.membertest.category;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_idx;

    @Column(name = "CATEGORY_NAME")
    private String category_name;

    public void setCategory_idx(int category_idx) {
        this.category_idx = category_idx;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public int getCategory_idx(){
        return category_idx;
    }

    public String getCategory_name() {
        return category_name;
    }
}