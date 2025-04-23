package com.jingdianjichi.subject.domain.service;

import com.jingdianjichi.subject.domain.entity.SubjectCategoryBO;
import com.jingdianjichi.subject.infra.basic.entity.SubjectCategory;

import java.util.List;


public interface SubjectCategoryDomainService {

    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询岗位大类
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);

    Boolean update(SubjectCategoryBO subjectCategoryBO);

    Boolean delete(SubjectCategoryBO subjectCategoryBO);
}
