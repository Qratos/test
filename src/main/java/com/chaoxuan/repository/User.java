package com.chaoxuan.repository;

import org.bson.types.ObjectId;

import javax.persistence.Id;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public class User {
    @Id
    private ObjectId id;
    private String name;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
