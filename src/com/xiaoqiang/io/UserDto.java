package com.xiaoqiang.io;

import java.util.List;

public class UserDto {
    private Integer id;
    private List<User> list;

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", list=" + list +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public UserDto(Integer id, List<User> list) {
        this.id = id;
        this.list = list;
    }
}
