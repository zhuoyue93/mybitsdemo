package com.example.demo.entity;

public class ItemInfo {
    private Long pk;
    private Long pkItem;
    private String itemnum;
    private String iteminfo;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getPkItem() {
        return pkItem;
    }

    public void setPkItem(Long pkItem) {
        this.pkItem = pkItem;
    }

    public String getItemnum() {
        return itemnum;
    }

    public void setItemnum(String itemnum) {
        this.itemnum = itemnum;
    }

    public String getIteminfo() {
        return iteminfo;
    }

    public void setIteminfo(String iteminfo) {
        this.iteminfo = iteminfo;
    }
}
