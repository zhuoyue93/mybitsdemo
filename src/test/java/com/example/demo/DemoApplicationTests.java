package com.example.demo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
        String jone = "Jone";
        List<User> objects = userMapper.selectList(Wrappers.<User>lambdaQuery().eq(User::getName, jone));
        objects.forEach(System.out::println);
    }

}
