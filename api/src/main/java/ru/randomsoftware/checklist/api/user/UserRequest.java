package ru.randomsoftware.checklist.api.user;

import ru.randomsoftware.checklist.dao.entity.User;

public class UserRequest {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User asUser() {
        return new User(username, password);
    }
}
