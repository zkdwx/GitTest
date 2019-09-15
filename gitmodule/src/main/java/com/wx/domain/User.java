package com.wx.domain;

public class User {
    private String name;
    private Integer age;
    private String address;

    public void call(String name){
        System.out.println("name"+name);
    }

    public void email(String address){
        System.out.println("address"+address);
    }
}
