package com.jingdianjichi.subject.infra.basic.service.impl;

import com.jingdianjichi.subject.infra.basic.entity.SubjectJudge;
import com.jingdianjichi.subject.infra.basic.dao.SubjectJudgeDao;
import com.jingdianjichi.subject.infra.basic.service.SubjectJudgeService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * 判断题(SubjectJudge)表服务实现类
 *
 * @author makejava
 * @since 2025-04-25 15:31:58
 */
@Service("subjectJudgeService")
public class SubjectJudgeServiceImpl implements SubjectJudgeService {
    @Resource
    private SubjectJudgeDao subjectJudgeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SubjectJudge queryById(Long id) {
        return this.subjectJudgeDao.queryById(id);
    }


    /**
     * 新增数据
     *
     * @param subjectJudge 实例对象
     * @return 实例对象
     */
    @Override
    public void insert(SubjectJudge subjectJudge) {
        this.subjectJudgeDao.insert(subjectJudge);
    }

    /**
     * 修改数据
     *
     * @param subjectJudge 实例对象
     * @return 实例对象
     */
    @Override
    public SubjectJudge update(SubjectJudge subjectJudge) {
        this.subjectJudgeDao.update(subjectJudge);
        return this.queryById(subjectJudge.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.subjectJudgeDao.deleteById(id) > 0;
    }

    @Override
    public SubjectJudge queryByCondition(int subjectId) {

        return this.subjectJudgeDao.queryByCondition(subjectId);
    }
}
