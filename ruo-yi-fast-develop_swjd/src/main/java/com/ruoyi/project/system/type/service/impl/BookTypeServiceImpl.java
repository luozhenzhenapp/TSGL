package com.ruoyi.project.system.type.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.type.mapper.BookTypeMapper;
import com.ruoyi.project.system.type.domain.BookType;
import com.ruoyi.project.system.type.service.IBookTypeService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 书籍分类Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
@Service
public class BookTypeServiceImpl implements IBookTypeService 
{
    @Autowired
    private BookTypeMapper bookTypeMapper;

    /**
     * 查询书籍分类
     * 
     * @param id 书籍分类主键
     * @return 书籍分类
     */
    @Override
    public BookType selectBookTypeById(Long id)
    {
        return bookTypeMapper.selectBookTypeById(id);
    }

    /**
     * 查询书籍分类列表
     * 
     * @param bookType 书籍分类
     * @return 书籍分类
     */
    @Override
    public List<BookType> selectBookTypeList(BookType bookType)
    {
        return bookTypeMapper.selectBookTypeList(bookType);
    }

    /**
     * 新增书籍分类
     * 
     * @param bookType 书籍分类
     * @return 结果
     */
    @Override
    public int insertBookType(BookType bookType)
    {
        bookType.setCreateTime(DateUtils.getNowDate());
        return bookTypeMapper.insertBookType(bookType);
    }

    /**
     * 修改书籍分类
     * 
     * @param bookType 书籍分类
     * @return 结果
     */
    @Override
    public int updateBookType(BookType bookType)
    {
        bookType.setUpdateTime(DateUtils.getNowDate());
        return bookTypeMapper.updateBookType(bookType);
    }

    /**
     * 批量删除书籍分类
     * 
     * @param ids 需要删除的书籍分类主键
     * @return 结果
     */
    @Override
    public int deleteBookTypeByIds(String ids)
    {
        return bookTypeMapper.deleteBookTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除书籍分类信息
     * 
     * @param id 书籍分类主键
     * @return 结果
     */
    @Override
    public int deleteBookTypeById(Long id)
    {
        return bookTypeMapper.deleteBookTypeById(id);
    }
}
