package com.example.hostel_app;

public class Complaint {
    private String description,subject;
    private int count;

    //getters
    public String getDescription() {
        return description;
    }
    public String getSubject() {
        return subject;
    }
    public int getCount() {
        return count;
    }

    //setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
