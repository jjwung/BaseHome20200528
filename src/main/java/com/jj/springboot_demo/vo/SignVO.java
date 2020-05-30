package com.jj.springboot_demo.vo;

import lombok.Data;

@Data
public class SignVO {
    // 身份证号码
    private int id_card_num;

    // 考生姓名
    private String name;

    // 报名的考试类别
    private String type;
}
