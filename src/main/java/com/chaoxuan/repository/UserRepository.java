package com.chaoxuan.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
public interface UserRepository extends MongoRepository<User,ObjectId> {
    List<User> findByName(String name);
}
