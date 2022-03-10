package com.codegym.model;

public class User {
    protected int id;
    protected String username;
    protected String password;
    protected double credit;
    protected String fullName;
    protected boolean role;
    protected String email;
    protected String img;
    protected String address;
    protected String phone;

    public User(int id, String username, String password, double credit, String fullName, boolean role, String email, String img, String address, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.credit = credit;
        this.fullName = fullName;
        this.role = role;
        this.email = email;
        this.img = img;
        this.address = address;
        this.phone = phone;
    }

    public User(String username, String password, double credit, String fullName, boolean role, String email, String img, String address, String phone) {
        this.username = username;
        this.password = password;
        this.credit = credit;
        this.fullName = fullName;
        this.role = role;
        this.email = email;
        this.img = img;
        this.address = address;
        this.phone = phone;
    }

    public User(String username, String password, String fullName, String email, String address, String phone) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}