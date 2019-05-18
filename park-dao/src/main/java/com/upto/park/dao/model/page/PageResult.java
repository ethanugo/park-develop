package com.upto.park.dao.model.page;

import java.io.Serializable;

/**
 * 分页查询结果实体类
 * @param <T>
 */
public class PageResult<T> implements Serializable{
    private static final long serialVersionUID = -9119590326313920627L;
    /**
     * 当前页码
     */
    private Integer currentPage = 1;

    /**
     * 分页大小
     */
    private Integer pageSize = 10;

    /**
     * 数据总数
     */
    private Integer totalRecord;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 数据
     */
    private T data;

    public PageResult() {
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        if (null != currentPage && !"".equals(currentPage)) {
            this.currentPage = currentPage;
        }
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (null != pageSize && !"".equals(pageSize)) {
            this.pageSize = pageSize;
        }
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        Integer totalPage;
        if(totalRecord % this.pageSize == 0) {
            totalPage = totalRecord / this.pageSize;
        } else {
            totalPage = totalRecord / this.pageSize + 1;
        }

        this.totalPage = totalPage;
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
