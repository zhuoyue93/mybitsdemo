package com.example.demo.entity;

import java.sql.Date;

public class ItemRecord {

    private Long id;
    private Long userid;
    private Long itemid;
    private Date date;
    private Long num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
