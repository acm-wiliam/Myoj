package com.yws.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yws.mapper.UserMapper;
import com.yws.pojo.User;
import com.yws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;      //留着备用
    @Override
    public User getByUserName(String username) {
        return userMapper.getByUserName(username);
    }
    @Override
    public boolean login(User user) {
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.like(user.getUsername()!=null,User::getUsername,user.getUsername());
//        lqw.like(user.getPassword()!=null,User::getPassword,user.getPassword());
        User one = userMapper.getByUserNameAndPassword(user.getUsername(),user.getPassword());
        return one!=null;
    }
}
