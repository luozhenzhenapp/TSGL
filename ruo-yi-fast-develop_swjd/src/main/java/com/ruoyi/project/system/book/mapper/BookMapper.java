package com.ruoyi.project.system.book.mapper;

import java.util.List;
import com.ruoyi.project.system.book.domain.Book;

/**
 * 书籍信息Mapper接口
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public interface BookMapper 
{
    /**
     * 查询书籍信息
     * 
     * @param id 书籍信息主键
     * @return 书籍信息
     */
    public Book selectBookById(Long id);

    /**
     * 查询书籍信息列表
     * 
     * @param book 书籍信息
     * @return 书籍信息集合
     */
    public List<Book> selectBookList(Book book);

    /**
     * 新增书籍信息
     * 
     * @param book 书籍信息
     * @return 结果
     */
    public int insertBook(Book book);

    /**
     * 修改书籍信息
     * 
     * @param book 书籍信息
     * @return 结果
     */
    public int updateBook(Book book);

    /**
     * 删除书籍信息
     * 
     * @param id 书籍信息主键
     * @return 结果
     */
    public int deleteBookById(Long id);

    /**
     * 批量删除书籍信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookByIds(String[] ids);
}
