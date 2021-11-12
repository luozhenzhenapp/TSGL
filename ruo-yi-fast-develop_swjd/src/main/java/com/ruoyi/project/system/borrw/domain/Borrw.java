package com.ruoyi.project.system.borrw.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 书籍借取记录对象 borrw
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public class Borrw extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    private Long userId;

    /** 书籍id */
    private Long bookId;

    /** 预期归还时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预期归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expectedRetur;

    /** 实际归还时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实际归还时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualReturn;

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setBookId(Long bookId)
    {
        this.bookId = bookId;
    }

    public Long getBookId()
    {
        return bookId;
    }
    public void setExpectedRetur(Date expectedRetur)
    {
        this.expectedRetur = expectedRetur;
    }

    public Date getExpectedRetur()
    {
        return expectedRetur;
    }
    public void setActualReturn(Date actualReturn)
    {
        this.actualReturn = actualReturn;
    }

    public Date getActualReturn()
    {
        return actualReturn;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("expectedRetur", getExpectedRetur())
            .append("actualReturn", getActualReturn())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
