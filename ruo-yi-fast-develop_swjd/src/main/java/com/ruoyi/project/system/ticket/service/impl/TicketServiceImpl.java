package com.ruoyi.project.system.ticket.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.ticket.mapper.TicketMapper;
import com.ruoyi.project.system.ticket.domain.Ticket;
import com.ruoyi.project.system.ticket.service.ITicketService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 用户超时罚单记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
@Service
public class TicketServiceImpl implements ITicketService 
{
    @Autowired
    private TicketMapper ticketMapper;

    /**
     * 查询用户超时罚单记录
     * 
     * @param id 用户超时罚单记录主键
     * @return 用户超时罚单记录
     */
    @Override
    public Ticket selectTicketById(Long id)
    {
        return ticketMapper.selectTicketById(id);
    }

    /**
     * 查询用户超时罚单记录列表
     * 
     * @param ticket 用户超时罚单记录
     * @return 用户超时罚单记录
     */
    @Override
    public List<Ticket> selectTicketList(Ticket ticket)
    {
        return ticketMapper.selectTicketList(ticket);
    }

    /**
     * 新增用户超时罚单记录
     * 
     * @param ticket 用户超时罚单记录
     * @return 结果
     */
    @Override
    public int insertTicket(Ticket ticket)
    {
        ticket.setCreateTime(DateUtils.getNowDate());
        return ticketMapper.insertTicket(ticket);
    }

    /**
     * 修改用户超时罚单记录
     * 
     * @param ticket 用户超时罚单记录
     * @return 结果
     */
    @Override
    public int updateTicket(Ticket ticket)
    {
        ticket.setUpdateTime(DateUtils.getNowDate());
        return ticketMapper.updateTicket(ticket);
    }

    /**
     * 批量删除用户超时罚单记录
     * 
     * @param ids 需要删除的用户超时罚单记录主键
     * @return 结果
     */
    @Override
    public int deleteTicketByIds(String ids)
    {
        return ticketMapper.deleteTicketByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户超时罚单记录信息
     * 
     * @param id 用户超时罚单记录主键
     * @return 结果
     */
    @Override
    public int deleteTicketById(Long id)
    {
        return ticketMapper.deleteTicketById(id);
    }
}
