package com.kodilla.good.patterns.challenges;

public class User {
    private String user;
    private String surname;

    public User(String user, String surname) {
        this.user = user;
        this.surname = surname;
    }

    public String getUser() {
        return user;
    }

    public String getSurname() {
        return surname;
    }
}
