package com.jj.springboot_demo.dao;

import com.jj.springboot_demo.vo.ApplyForExamVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExamDao {
    /**
     * 报名操作，添加考生id，初始化判断有资格后是否报名为是，考卷编码乃对应每一场考试，
     * 考试类型是根据学生历史考试成绩来判断只能进行哪个考试
     * 考试开始时间和结束时间暂时定为死的
     *
     * @param apply
     */
    public ApplyForExamVO apply(ApplyForExamVO apply);
}
