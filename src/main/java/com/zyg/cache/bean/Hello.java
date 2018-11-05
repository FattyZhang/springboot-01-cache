package com.zyg.cache.bean;

/**
 * @Author Administrator
 * @date 2018/11/5 - 14:18
 */
public class Hello {

    private String str;
    private String str1;
    private String str2;

    public Hello(String str, String str1, String str2) {
        this.str = str;
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                ", str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
