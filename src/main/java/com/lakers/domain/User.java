package com.lakers.domain;

import java.io.Serializable;

/**
 * @Author: panyusheng
 * @Date: 2020/5/19 14:21
 * @Version 1.0
 */
public class User implements Serializable {

    private String uname;

    private Integer age;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }
}
