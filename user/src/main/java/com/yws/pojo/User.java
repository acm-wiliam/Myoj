package com.yws.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@Component
public class User {
    String username;
    long id;
    int age;
    String email;
    String phone;
    String password;
    String gender;
    public User(){}
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
}
