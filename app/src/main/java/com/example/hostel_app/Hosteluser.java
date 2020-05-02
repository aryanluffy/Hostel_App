package com.example.hostel_app;

import androidx.annotation.NonNull;

public class Hosteluser {
    private String name,email,mobile,gender,room,password;
    private int age;
    private boolean resident;

    //getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getMobile() {
        return mobile;
    }
    public String getGender() {
        return gender;
    }
    public String getRoom() {
        return room;
    }
    public boolean isResident() {
        return resident;
    }
    public String getPassword() {
        return password;
    }

    //setters
    public void setResident(boolean resident) {
        this.resident = resident;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
