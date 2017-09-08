package com.chaoxuan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23 0023.
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
List<Customer> findByFirstName(String str);
}
