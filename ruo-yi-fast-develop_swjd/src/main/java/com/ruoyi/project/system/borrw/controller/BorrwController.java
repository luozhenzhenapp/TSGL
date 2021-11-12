package com.ruoyi.project.system.borrw.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.system.borrw.domain.Borrw;
import com.ruoyi.project.system.borrw.service.IBorrwService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 书籍借取记录Controller
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
@Controller
@RequestMapping("/system/borrw")
public class BorrwController extends BaseController
{
    private String prefix = "system/borrw";

    @Autowired
    private IBorrwService borrwService;

    @RequiresPermissions("system:borrw:view")
    @GetMapping()
    public String borrw()
    {
        return prefix + "/borrw";
    }

    /**
     * 查询书籍借取记录列表
     */
    @RequiresPermissions("system:borrw:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Borrw borrw)
    {
        startPage();
        List<Borrw> list = borrwService.selectBorrwList(borrw);
        return getDataTable(list);
    }

    /**
     * 导出书籍借取记录列表
     */
    @RequiresPermissions("system:borrw:export")
    @Log(title = "书籍借取记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Borrw borrw)
    {
        List<Borrw> list = borrwService.selectBorrwList(borrw);
        ExcelUtil<Borrw> util = new ExcelUtil<Borrw>(Borrw.class);
        return util.exportExcel(list, "书籍借取记录数据");
    }

    /**
     * 新增书籍借取记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存书籍借取记录
     */
    @RequiresPermissions("system:borrw:add")
    @Log(title = "书籍借取记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Borrw borrw)
    {
        return toAjax(borrwService.insertBorrw(borrw));
    }

    /**
     * 修改书籍借取记录
     */
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        Borrw borrw = borrwService.selectBorrwByUserId(userId);
        mmap.put("borrw", borrw);
        return prefix + "/edit";
    }

    /**
     * 修改保存书籍借取记录
     */
    @RequiresPermissions("system:borrw:edit")
    @Log(title = "书籍借取记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Borrw borrw)
    {
        return toAjax(borrwService.updateBorrw(borrw));
    }

    /**
     * 删除书籍借取记录
     */
    @RequiresPermissions("system:borrw:remove")
    @Log(title = "书籍借取记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(borrwService.deleteBorrwByUserIds(ids));
    }
}
