package com.jj.springboot_demo.service;

import com.jj.springboot_demo.vo.ApplyForExamVO;

public interface ExampService {
    /**
     * 此类用以报名方法，包括考生信息，要报名的考试信息，用以生成考试信息
     *
     * @param apply 接收的考试报名入参
     * @return
     */
    ApplyForExamVO apply(ApplyForExamVO apply);
}
