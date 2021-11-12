package com.ruoyi.project.system.ticket.service;

import java.util.List;
import com.ruoyi.project.system.ticket.domain.Ticket;

/**
 * 用户超时罚单记录Service接口
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
public interface ITicketService 
{
    /**
     * 查询用户超时罚单记录
     * 
     * @param id 用户超时罚单记录主键
     * @return 用户超时罚单记录
     */
    public Ticket selectTicketById(Long id);

    /**
     * 查询用户超时罚单记录列表
     * 
     * @param ticket 用户超时罚单记录
     * @return 用户超时罚单记录集合
     */
    public List<Ticket> selectTicketList(Ticket ticket);

    /**
     * 新增用户超时罚单记录
     * 
     * @param ticket 用户超时罚单记录
     * @return 结果
     */
    public int insertTicket(Ticket ticket);

    /**
     * 修改用户超时罚单记录
     * 
     * @param ticket 用户超时罚单记录
     * @return 结果
     */
    public int updateTicket(Ticket ticket);

    /**
     * 批量删除用户超时罚单记录
     * 
     * @param ids 需要删除的用户超时罚单记录主键集合
     * @return 结果
     */
    public int deleteTicketByIds(String ids);

    /**
     * 删除用户超时罚单记录信息
     * 
     * @param id 用户超时罚单记录主键
     * @return 结果
     */
    public int deleteTicketById(Long id);
}
