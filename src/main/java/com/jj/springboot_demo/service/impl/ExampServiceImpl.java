package com.jj.springboot_demo.service.impl;

import com.jj.springboot_demo.dao.ExamDao;
import com.jj.springboot_demo.service.ExampService;
import com.jj.springboot_demo.vo.ApplyForExamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampServiceImpl implements ExampService {
    @Autowired
    private ExamDao examDao;

    @Override
    public ApplyForExamVO apply(ApplyForExamVO apply) {
        return examDao.apply(apply);
    }
}
