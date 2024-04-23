package com.yws;

import com.yws.mapper.ProblemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestApplicationTest {

    @Autowired
    private ProblemMapper problemMapper;

    @Test
    void MybatisTest(){
        System.out.println(problemMapper.getById((1)));
    }
}
