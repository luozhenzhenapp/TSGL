package com.ruoyi.project.system.type.service;

import java.util.List;
import com.ruoyi.project.system.type.domain.BookType;

/**
 * 书籍分类Service接口
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public interface IBookTypeService 
{
    /**
     * 查询书籍分类
     * 
     * @param id 书籍分类主键
     * @return 书籍分类
     */
    public BookType selectBookTypeById(Long id);

    /**
     * 查询书籍分类列表
     * 
     * @param bookType 书籍分类
     * @return 书籍分类集合
     */
    public List<BookType> selectBookTypeList(BookType bookType);

    /**
     * 新增书籍分类
     * 
     * @param bookType 书籍分类
     * @return 结果
     */
    public int insertBookType(BookType bookType);

    /**
     * 修改书籍分类
     * 
     * @param bookType 书籍分类
     * @return 结果
     */
    public int updateBookType(BookType bookType);

    /**
     * 批量删除书籍分类
     * 
     * @param ids 需要删除的书籍分类主键集合
     * @return 结果
     */
    public int deleteBookTypeByIds(String ids);

    /**
     * 删除书籍分类信息
     * 
     * @param id 书籍分类主键
     * @return 结果
     */
    public int deleteBookTypeById(Long id);
}
