package com.klaus.entity;

public class Menu {
    private int id;
    private String name;
    private int level;
    private String Ename;

    public Menu() {
    }

    public Menu(int id, String name, int level, String ename) {
        this.id = id;
        this.name = name;
        this.level = level;
        Ename = ename;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", Ename='" + Ename + '\'' +
                '}';
    }
}