package com.codegym.model;

public class Story {
    protected int id;
    protected int categoryId;
    protected String img;

    protected String name;
    protected double price;
    protected String writer;
    protected String dateSubmited;

    public Story() {
    }

    public Story(int id, int categoryId, String img, String name, double price, String writer, String dateSubmited) {
        this.id = id;
        this.categoryId = categoryId;
        this.img = img;
        this.name = name;
        this.price = price;
        this.writer = writer;
        this.dateSubmited = dateSubmited;
    }

    public Story(int categoryId, String img, String name, double price, String writer, String dateSubmited) {
        this.categoryId = categoryId;
        this.img = img;
        this.name = name;
        this.price = price;
        this.writer = writer;
        this.dateSubmited = dateSubmited;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDateSubmited() {
        return dateSubmited;
    }

    public void setDateSubmited(String dateSubmited) {
        this.dateSubmited = dateSubmited;
    }
}
