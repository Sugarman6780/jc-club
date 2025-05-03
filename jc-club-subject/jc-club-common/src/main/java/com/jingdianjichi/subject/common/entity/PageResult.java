package com.jingdianjichi.subject.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {

    private Integer pageNo = 1;

    private Integer pageSize = 20;

    private Integer total = 0;

    private Integer totalPages = 0;

    private List<T> result = Collections.emptyList();

    private Integer start = 1;

    private Integer end = 0;

    public void setRecord(List<T> result){
        this.result = result;
        if(result != null && result.size() > 0){
            setTotal(result.size());
        }
    }

    public void setTotal(int total) {
        this.total = total;
        if(this.pageSize > 0 ){
            this.totalPages = (total / pageSize) + (total % pageSize == 0 ? 0 : 1);
        } else {
            this.totalPages = 0;
        }
        this.start = (this.pageSize > 0 ? (pageNo - 1) * this.pageSize : 0) + 1;
        this.end = (this.start - 1 + this.pageSize * (this.pageNo > 0 ? 1 : 0));
    }

    public void setPageNo(Integer pageNo){
        this.pageNo = pageNo;
    }

    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
    }
}
