package com.example.hostel_app;

public class Complaint {
    private String description,subject,room;
    //getters
    public String getDescription() {
        return description;
    }
    public String getSubject() {
        return subject;
    }
    public String getRoom() {
        return room;
    }

    //setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setRoom(String room) {
        this.room = room;
    }
}
