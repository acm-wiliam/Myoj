package com.yws.mapper;

import com.yws.pojo.Problems;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProblemMapper {

    @Select("select * from problems where id = #{id}")
    public Problems getById(Integer id);
}
