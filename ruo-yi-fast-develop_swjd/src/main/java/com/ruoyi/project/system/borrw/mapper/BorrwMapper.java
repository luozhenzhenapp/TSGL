package com.ruoyi.project.system.borrw.mapper;

import java.util.List;
import com.ruoyi.project.system.borrw.domain.Borrw;

/**
 * 书籍借取记录Mapper接口
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public interface BorrwMapper 
{
    /**
     * 查询书籍借取记录
     * 
     * @param userId 书籍借取记录主键
     * @return 书籍借取记录
     */
    public Borrw selectBorrwByUserId(Long userId);

    /**
     * 查询书籍借取记录列表
     * 
     * @param borrw 书籍借取记录
     * @return 书籍借取记录集合
     */
    public List<Borrw> selectBorrwList(Borrw borrw);

    /**
     * 新增书籍借取记录
     * 
     * @param borrw 书籍借取记录
     * @return 结果
     */
    public int insertBorrw(Borrw borrw);

    /**
     * 修改书籍借取记录
     * 
     * @param borrw 书籍借取记录
     * @return 结果
     */
    public int updateBorrw(Borrw borrw);

    /**
     * 删除书籍借取记录
     * 
     * @param userId 书籍借取记录主键
     * @return 结果
     */
    public int deleteBorrwByUserId(Long userId);

    /**
     * 批量删除书籍借取记录
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBorrwByUserIds(String[] userIds);
}
