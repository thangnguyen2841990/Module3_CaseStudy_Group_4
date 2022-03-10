package com.codegym.model;

public class PartImage {
    protected int id;
    protected int storyId;
    protected int partId;
    protected String img;

    public PartImage(int id, int storyId, int partId, String img) {
        this.id = id;
        this.storyId = storyId;
        this.partId = partId;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
