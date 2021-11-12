package com.ruoyi.project.system.borrw.service;

import java.util.List;
import com.ruoyi.project.system.borrw.domain.Borrw;

/**
 * 书籍借取记录Service接口
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public interface IBorrwService 
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
     * 批量删除书籍借取记录
     * 
     * @param userIds 需要删除的书籍借取记录主键集合
     * @return 结果
     */
    public int deleteBorrwByUserIds(String userIds);

    /**
     * 删除书籍借取记录信息
     * 
     * @param userId 书籍借取记录主键
     * @return 结果
     */
    public int deleteBorrwByUserId(Long userId);
}
