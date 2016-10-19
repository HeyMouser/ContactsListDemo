package com.yh.contactslistdemo.IndexBar.bean;

/**
 * Created by YH on 2016/10/18.
 */

public class BaseIndexTagBean {
    private String baseIndexTag;//城市或者联系人的汉语拼音首字母

    public String getBaseIndexTag() {
        return baseIndexTag;
    }

    public void setBaseIndexTag(String baseIndexTag) {
        this.baseIndexTag = baseIndexTag;
    }

    @Override
    public String toString() {
        return "BaseIndexTagBean{" +
                "baseIndexTag='" + baseIndexTag + '\'' +
                '}';
    }
}
