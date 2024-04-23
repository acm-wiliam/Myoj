package com.yws.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yws.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User> {
//    自己写的查询
//    @Select("select * from problems where id= #{id}")
//    public Problems getById(Integer id);
    @Select("select * from user where username= #{username}")
    public User getByUserName(String username);

    @Select("select * from user where username= #{username} && password=#{password}")
    public User getByUserNameAndPassword(String username,String password);
}
