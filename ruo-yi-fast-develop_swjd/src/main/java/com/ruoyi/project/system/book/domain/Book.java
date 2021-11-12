package com.ruoyi.project.system.book.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 书籍信息对象 book
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public class Book extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 书籍名称 */
    @Excel(name = "书籍名称")
    private String bookName;

    /** 书籍作者 */
    @Excel(name = "书籍作者")
    private String bookAuthor;

    /** 书籍出版社 */
    @Excel(name = "书籍出版社")
    private String bookPub;

    /** 书籍库存 */
    @Excel(name = "书籍库存")
    private Long bookNum;

    /** 书籍分类 */
    @Excel(name = "书籍分类")
    private String bookTypeId;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookName()
    {
        return bookName;
    }
    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }
    public void setBookPub(String bookPub)
    {
        this.bookPub = bookPub;
    }

    public String getBookPub()
    {
        return bookPub;
    }
    public void setBookNum(Long bookNum)
    {
        this.bookNum = bookNum;
    }

    public Long getBookNum()
    {
        return bookNum;
    }
    public void setBookTypeId(String bookTypeId)
    {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeId()
    {
        return bookTypeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bookName", getBookName())
            .append("bookAuthor", getBookAuthor())
            .append("bookPub", getBookPub())
            .append("bookNum", getBookNum())
            .append("bookTypeId", getBookTypeId())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
