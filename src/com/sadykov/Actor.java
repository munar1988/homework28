package com.sadykov;

public class Actor {
    private String fullName;
    private String role;

    public Actor(String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }
}

