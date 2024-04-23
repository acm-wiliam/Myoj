package com.yws.pojo;

import lombok.Data;

@Data
//@Component
public class Problems {
    String pb_name;
    long id;
    String description;
    String output;
    String input;
    String tag;
    String source;

}
