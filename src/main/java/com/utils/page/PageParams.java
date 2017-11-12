package com.utils.page;

/**
 * 分页参数
 *
 * @author created by wangyong on 17-11-12
 */
public class PageParams {

    /**
     * 当前的页码
     */
    private Integer page;

    /**
     * 每页展示记录数
     */
    private Integer pageSize;

    /**
     * 是否启动插件
     */
    private Boolean useFlag;

    /**
     * 检查当前页码有效性
     */
    private Boolean checkFlag;

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 总页数
     */
    private Integer totalPage;

    public Integer getPage() {
        return page;
    }

    public PageParams setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public PageParams setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Boolean getUseFlag() {
        return useFlag;
    }

    public PageParams setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }

    public Boolean getCheckFlag() {
        return checkFlag;
    }

    public PageParams setCheckFlag(Boolean checkFlag) {
        this.checkFlag = checkFlag;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public PageParams setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public PageParams setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageParams{");
        sb.append("page=").append(page);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", checkFlag=").append(checkFlag);
        sb.append(", total=").append(total);
        sb.append(", totalPage=").append(totalPage);
        sb.append('}');
        return sb.toString();
    }
}
