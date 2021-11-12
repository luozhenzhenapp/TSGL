package com.ruoyi.project.system.borrw.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.borrw.mapper.BorrwMapper;
import com.ruoyi.project.system.borrw.domain.Borrw;
import com.ruoyi.project.system.borrw.service.IBorrwService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 书籍借取记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
@Service
public class BorrwServiceImpl implements IBorrwService 
{
    @Autowired
    private BorrwMapper borrwMapper;

    /**
     * 查询书籍借取记录
     * 
     * @param userId 书籍借取记录主键
     * @return 书籍借取记录
     */
    @Override
    public Borrw selectBorrwByUserId(Long userId)
    {
        return borrwMapper.selectBorrwByUserId(userId);
    }

    /**
     * 查询书籍借取记录列表
     * 
     * @param borrw 书籍借取记录
     * @return 书籍借取记录
     */
    @Override
    public List<Borrw> selectBorrwList(Borrw borrw)
    {
        return borrwMapper.selectBorrwList(borrw);
    }

    /**
     * 新增书籍借取记录
     * 
     * @param borrw 书籍借取记录
     * @return 结果
     */
    @Override
    public int insertBorrw(Borrw borrw)
    {
        borrw.setCreateTime(DateUtils.getNowDate());
        return borrwMapper.insertBorrw(borrw);
    }

    /**
     * 修改书籍借取记录
     * 
     * @param borrw 书籍借取记录
     * @return 结果
     */
    @Override
    public int updateBorrw(Borrw borrw)
    {
        borrw.setUpdateTime(DateUtils.getNowDate());
        return borrwMapper.updateBorrw(borrw);
    }

    /**
     * 批量删除书籍借取记录
     * 
     * @param userIds 需要删除的书籍借取记录主键
     * @return 结果
     */
    @Override
    public int deleteBorrwByUserIds(String userIds)
    {
        return borrwMapper.deleteBorrwByUserIds(Convert.toStrArray(userIds));
    }

    /**
     * 删除书籍借取记录信息
     * 
     * @param userId 书籍借取记录主键
     * @return 结果
     */
    @Override
    public int deleteBorrwByUserId(Long userId)
    {
        return borrwMapper.deleteBorrwByUserId(userId);
    }
}
