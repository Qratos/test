package com.chaoxuan.controller;

import com.chaoxuan.repository.Customer;
import com.chaoxuan.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping(value="test",method = RequestMethod.POST)
    public Object test(@RequestParam("mobile") String mobile){
      Map map=new HashMap<>();
      map.put("key",mobile);
      return map;
    }
}
