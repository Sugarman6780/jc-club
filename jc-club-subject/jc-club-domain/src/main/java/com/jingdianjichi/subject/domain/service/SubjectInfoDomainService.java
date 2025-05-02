package com.jingdianjichi.subject.domain.service;



import com.jingdianjichi.subject.common.entity.PageResult;
import com.jingdianjichi.subject.domain.entity.SubjectInfoBO;

import java.util.List;


public interface SubjectInfoDomainService {

    /**
     * 新增题目
     *
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 分页查询
     *
     */
    PageResult<SubjectInfoBO> getSubjectPage(SubjectInfoBO subjectInfoBO);

    /**
     * 查询题目信息
     *
     */
    SubjectInfoBO querySubjectInfo(SubjectInfoBO subjectInfoBO);
}


