package com.xuan.asange.databindingdemo;

/**
 * Description
 * Company
 * author  youxuan  E-mail:xuanyouwu@163.com
 * date createTime：16/12/14
 * version
 */

public class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
