package com.sda.mvc.model;

public enum Fatigue {
    TIRED("tired"), SLEEPING("slepping");

    private String title;
    Fatigue(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
