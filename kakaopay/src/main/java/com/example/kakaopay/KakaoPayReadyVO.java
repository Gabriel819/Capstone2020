package com.example.kakaopay;

import java.util.Date;
import lombok.Data;

@Data
public class KakaoPayReadyVO {
    // response
    private String tid, next_redirect_pc_url;
    private Data created_at;

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return tid;
    }

    public void setNext_redirect_pc_url(String next_redirect_pc_url) {
        this.next_redirect_pc_url = next_redirect_pc_url;
    }

    public String getNext_redirect_pc_url() {
        return next_redirect_pc_url;
    }

    public void setCreated_at(Data created_at) {
        this.created_at = created_at;
    }

    public Data getCreated_at() {
        return created_at;
    }
}
