package com.yws.test;

import com.yws.utils.ToolMD5;
import org.springframework.util.DigestUtils;


public class TestMd5 {
    public static void main(String[] args) {
//        int pass = 123456;
        String pass = "123456";
        System.out.println(pass);
        String mid = ToolMD5.convertMD5(pass);
        System.out.println(mid);
        System.out.println(ToolMD5.convertMD5(mid));
    }
}
