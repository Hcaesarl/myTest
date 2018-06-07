package com.klaus.entity;

public class User {
    private int id;
    private String name;
    private int num;
    private int level;
    private String password;
    private int tel;
    private String department;
    private String position;
    private int type;

    public User() {
    }

    public User(int id, String name, int num, int level, String password, int tel, String department, String position, int type) {

        this.id = id;
        this.name = name;
        this.num = num;
        this.level = level;
        this.password = password;
        this.tel = tel;
        this.department = department;
        this.position = position;
        this.type = type;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", level=" + level +
                ", password='" + password + '\'' +
                ", tel=" + tel +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", type=" + type +
                '}';
    }
}
