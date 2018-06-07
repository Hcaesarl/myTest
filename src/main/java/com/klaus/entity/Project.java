package com.klaus.entity;

public class Project {
    private int id;
    private String name;
    private String location;
    private String cycle;//周期
    private String quota;//站点数量
    private int departmentId;//负责部门
    private String message;

    public Project() {
    }

    public Project(int id, String name, String location, String cycle, String quota, int departmentId, String message) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cycle = cycle;
        this.quota = quota;
        this.departmentId = departmentId;
        this.message = message;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cycle='" + cycle + '\'' +
                ", quota='" + quota + '\'' +
                ", departmentId=" + departmentId +
                ", message='" + message + '\'' +
                '}';
    }
}
