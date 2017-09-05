package service;

import com.chaoxuan.Application;
import com.chaoxuan.repository.User;
import com.chaoxuan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/9/5 0005.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindOne() {
        List<User> one = userService.findByName("张三");
        System.out.println(one);
    }

    @Test
    public void testAll() {
        List<User> list = userService.list();
        System.out.println(list.size());
    }
}
