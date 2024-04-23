package com.yws.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yws.pojo.User;
import com.yws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 查询单个
    @GetMapping("{id}")
    public User queryById(@PathVariable int id){
        return userService.getById(id);
    }

    // 查询单个  通过用户名查询
    @GetMapping ("name/{username}")
    public User queryByUserName(@PathVariable String username){
        return userService.getByUserName(username);
    }

    @GetMapping("login/{username}/{password}")
    public boolean queryByNameAndPasswd(@PathVariable String username,@PathVariable String password){
        return userService.login(new User(username,password));
    }

    // 查询全部
    @GetMapping
    public List<User> getAll(){
        return userService.list();
    }

    // 修改
    @PutMapping("update")
    public boolean modify(@RequestBody User user){
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper();
//        lqw.like(id > 0, User::getId, id);
        System.out.println(user);
        return userService.updateById(user);
    }

    // 删除
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable int id){
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(id>0,User::getId,id);
        return userService.remove(lqw);
    }


    // 插入
    @PostMapping("{id}")
    public boolean insertById(User user){
        return userService.save(user);
    }

    @PostMapping("insert/{name}/{pass}")
    public boolean insert(@PathVariable("name") String username,@PathVariable("pass") String password){
        return userService.save(new User(username,password));
    }
}
