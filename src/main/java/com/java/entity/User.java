package com.java.entity;

public class User {
    private String id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.name = username;
        this.password = password;
    }
}
