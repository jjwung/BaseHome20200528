package com.jj.springboot_demo.controller;

import com.jj.springboot_demo.service.ExampService;
import com.jj.springboot_demo.vo.ApplyForExamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExampService signUpService;

    // 请求
    @RequestMapping("/apply")
    public ApplyForExamVO applyForExam(@RequestBody ApplyForExamVO sign) {
        return signUpService.apply(sign);
    }
}
