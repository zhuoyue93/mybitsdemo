package com.example.demo;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
        String jone = "Jone";
        List<User> objects = userMapper.selectList(Wrappers.<User>lambdaQuery().eq(User::getName, jone));
        objects.forEach(System.out::println);
    }

}
