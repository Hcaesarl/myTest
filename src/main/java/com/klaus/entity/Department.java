package com.klaus.entity;

import java.util.List;

public class Department {
    private int id;
    private String name;
    private List<Position> position;
    private List<User> users;

    public Department() {
    }

    public Department(int id, String name, List<Position> position, List<User> users) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.users = users;
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

    public List<Position> getPosition() {
        return position;
    }

    public void setPosition(List<Position> position) {
        this.position = position;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", users=" + users +
                '}';
    }
}
