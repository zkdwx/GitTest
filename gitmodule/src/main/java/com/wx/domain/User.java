package com.wx.domain;

public class User {
    private String name;
    private Integer age;
    private String address;

    public void call(String name){
        System.out.println("name"+name);
    }
}
