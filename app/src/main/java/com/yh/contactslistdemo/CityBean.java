package com.yh.contactslistdemo;

import com.yh.contactslistdemo.IndexBar.bean.BaseIndexPinyinBean;

/**
 * Created by YH on 2016/10/18.
 */

public class CityBean extends BaseIndexPinyinBean {
    private String city;

    public CityBean() {
    }

    public CityBean(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getTarget() {
        return null;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "city='" + city + '\'' +
                '}';
    }
}
