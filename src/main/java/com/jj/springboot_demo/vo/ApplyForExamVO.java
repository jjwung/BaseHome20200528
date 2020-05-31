package com.jj.springboot_demo.vo;

import lombok.Data;

@Data
public class ApplyForExamVO {
    // 身份证号码
    private String idCardNum;

    // 考生姓名
    private String name;

    // 报名的考试类别
    private String type;
}
