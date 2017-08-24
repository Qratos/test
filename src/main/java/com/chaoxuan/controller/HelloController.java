package com.chaoxuan.controller;

import com.chaoxuan.repository.Customer;
import com.chaoxuan.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */
@RestController
public class HelloController {
  @Autowired
  CustomerRepository customerRepository;
    @RequestMapping("hello")
    public String hello(){
      List<Customer> list = customerRepository.findAll();
      Customer a=new Customer("sss","ssss");
      customerRepository.save(a);
      return list.toString();
    }
}
