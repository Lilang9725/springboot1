package com.cykj.springboot.entity;


public class ItemList {

    private int itemId;
    private int itemClass;
    private String itemName;
    private String remark;

    public ItemList() {
    }

    public ItemList(int itemId, int itemClass, String itemName, String remark) {
        this.itemId = itemId;
        this.itemClass = itemClass;
        this.itemName = itemName;
        this.remark = remark;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


    public int getItemClass() {
        return itemClass;
    }

    public void setItemClass(int itemClass) {
        this.itemClass = itemClass;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
