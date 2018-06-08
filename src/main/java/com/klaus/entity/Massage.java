package com.klaus.entity;

public class Massage {
    private int id;
    private String name;
    private User user;
    private String text;

    public Massage() {
    }

    public Massage(int id, String name, User user, String text) {

        this.id = id;
        this.name = name;
        this.user = user;
        this.text = text;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", text='" + text + '\'' +
                '}';
    }
}
