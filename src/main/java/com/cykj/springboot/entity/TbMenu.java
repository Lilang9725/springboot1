package com.cykj.springboot.entity;

import java.util.List;

public class TbMenu {

    private long menuId;
    private String menuName;
    private long parMenuId;
    private String menuPath;
    private String remark;
    private List<TbMenu> list;

    public TbMenu() {
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public long getParMenuId() {
        return parMenuId;
    }

    public void setParMenuId(long parMenuId) {
        this.parMenuId = parMenuId;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setList(List<TbMenu> list) {
        this.list = list;
    }

    public List<TbMenu> getList() {
        return list;
    }
}
