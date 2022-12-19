package com.example.ex2.model;

public class Student {
    public String name;
    public String id;
    public String avatarUrl;
    public String phone;
    public String address;
    public Boolean cb;

    public Student(String name, String id, String avatarUrl,String phone,String address,Boolean cb) {
        this.name = name;
        this.id = id;
        this.avatarUrl = avatarUrl;
        this.phone=phone;
        this.address=address;
        this.cb = cb;
    }

}
