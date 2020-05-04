package com.example.hostel_app;

public class Hosteluser {
    private String name, userid,mobile,gender,room,password,date;
    private int age;
    private boolean resident;

    //getters
    public String getDate() {
        return date;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getUserid() {
        return userid;
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
    public void setUserid(String userid) {
        this.userid = userid;
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
    public void setDate(String date) {
        this.date = date;
    }
}
