package com.example.demo.server;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserServer {

    @Resource
    private UserMapper userMapper;

    /**
     * 注册用户
     *
     * @param user 用户
     * @return User
     */
    @GetMapping("/insert")
    public User insert(User user) {
        userMapper.insert(user);
        return userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getName, user.getName()));
    }

    /**
     * 登录
     *
     * @param user 用户
     * @return User
     */
    @GetMapping("/login")
    public User login(User user) {
        return  userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getName, user.getName()).eq(User::getPassword, user.getPassword()));
    }

    /**
     * 修改用户信息
     *
     * @param user 用户
     * @return User
     */
    @GetMapping("/update")
    public User update(User user) {
        userMapper.updateById(user);
        return userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getId, user.getId()));
    }
}
