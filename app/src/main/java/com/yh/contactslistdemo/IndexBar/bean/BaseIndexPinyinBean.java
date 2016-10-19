package com.yh.contactslistdemo.IndexBar.bean;

/**
 * Created by YH on 2016/10/18.
 */

public abstract class BaseIndexPinyinBean extends BaseIndexTagBean implements IIndexTagetInterface {
    private String baseIndexPinyin;//城市的拼音

    public String getBaseIndexPinyin() {
        return baseIndexPinyin;
    }

    public void setBaseIndexPinyin(String baseIndexPinyin) {
        this.baseIndexPinyin = baseIndexPinyin;
    }

    @Override
    public String toString() {
        return "BaseIndexPinyinBean{" +
                "baseIndexPinyin='" + baseIndexPinyin + '\'' +
                '}';
    }
}
