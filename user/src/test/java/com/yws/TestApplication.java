package com.yws;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yws.mapper.UserMapper;
import com.yws.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplication {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testGetAll(){
        userMapper.selectList(null);
    }

    @Test
    void testSave(){
        User user = new User();
        user.setPassword("123");
        user.setUsername("Eric");
        userMapper.insert(user);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(4);
        user.setPassword("123");
        user.setUsername("Lily");
        userMapper.updateById(user);
    }

}
