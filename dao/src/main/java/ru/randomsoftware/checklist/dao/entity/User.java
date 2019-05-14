package ru.randomsoftware.checklist.dao.entity;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;

    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return String.format("User [username=%s]", username);
    }

}
