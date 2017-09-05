package com.chaoxuan.service;

import com.chaoxuan.repository.User;
import com.chaoxuan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> findByName(String str){
       return userRepository.findByName(str);
    }
    public List<User> list(){
        return userRepository.findAll();
    }
}
