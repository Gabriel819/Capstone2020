package com.example.membertest.item;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int item_idx;

    @Column(name = "ITEM_NAME")
    private String item_name;

    @Column(name = "CATEGORY_IDX")
    private int category_idx;

    @Column(name = "ITEM_NUM")
    private int item_num;

    @Column(name = "RENT_PRICE")
    private int rent_price;

    public void setCategory_idx(int category_idx) {
        this.category_idx = category_idx;
    }

    public void setItem_idx(int item_idx) {
        this.item_idx = item_idx;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_num(int item_num) {
        this.item_num = item_num;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    public int getItem_idx(){
        return item_idx;
    }

    public String getItem_name(){
        return item_name;
    }

    public int getCategory_idx(){
        return category_idx;
    }

    public int getItem_num(){
        return item_num;
    }

    public int getRent_price(){
        return rent_price;
    }
}