package com.yws.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yws.mapper.UserMapper;
import com.yws.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public interface UserService extends IService<User> {
    //通过用户名查询
    public User getByUserName(String username);
    public boolean login(User user);
}
