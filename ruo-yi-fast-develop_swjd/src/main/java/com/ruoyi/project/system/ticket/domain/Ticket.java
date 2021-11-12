package com.ruoyi.project.system.ticket.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 用户超时罚单记录对象 ticket
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public class Ticket extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 书籍id */
    @Excel(name = "书籍id")
    private Long bookId;

    /** 超期天数 */
    @Excel(name = "超期天数")
    private Long overDate;

    /** 罚款金额 */
    @Excel(name = "罚款金额")
    private BigDecimal ticketFee;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
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
    public void setOverDate(Long overDate)
    {
        this.overDate = overDate;
    }

    public Long getOverDate()
    {
        return overDate;
    }
    public void setTicketFee(BigDecimal ticketFee)
    {
        this.ticketFee = ticketFee;
    }

    public BigDecimal getTicketFee()
    {
        return ticketFee;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("bookId", getBookId())
            .append("overDate", getOverDate())
            .append("ticketFee", getTicketFee())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
