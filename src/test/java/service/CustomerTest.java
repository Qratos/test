package service;

import com.chaoxuan.Application;
import com.chaoxuan.repository.Customer;
import com.chaoxuan.repository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/9/8 0008.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomerTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void test(){
        List<Customer> sss = customerRepository.findByFirstName("sss");
        System.out.println(sss.size());
    }
}
