package com.codegym.model;

public class Part {
    protected int id;
    protected int storyID;
    protected int categoryId;
    protected int episode;
    protected String name;
    protected String content;

    public Part() {
    }

    public Part(int id, int storyID, int categoryId, int episode, String name, String content) {
        this.id = id;
        this.storyID = storyID;
        this.categoryId = categoryId;
        this.episode = episode;
        this.name = name;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
