package com.xiaoqiang.io;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static  final long serialVersionUID = 8173996079049405451L;
    private int id;
    private String name;
    private Date date;
    private String abc;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public User(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
}
