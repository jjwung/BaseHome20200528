package com.jj.springboot_demo.controller;

import com.jj.springboot_demo.service.ExamSignUpService;
import com.jj.springboot_demo.vo.SignVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signUp")
public class ExamSignUpController {
    @Autowired
    private ExamSignUpService signUpService;

    // 请求
    @RequestMapping("")
    public boolean signUp(@RequestBody SignVO sign) {
        return signUpService.signUp(sign);
    }
}
