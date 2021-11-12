package com.ruoyi.project.system.type.controller;

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
import com.ruoyi.project.system.type.domain.BookType;
import com.ruoyi.project.system.type.service.IBookTypeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 书籍分类Controller
 * 
 * @author ruoyi
 * @date 2021-11-12
 */
@Controller
@RequestMapping("/system/type")
public class BookTypeController extends BaseController
{
    private String prefix = "system/type";

    @Autowired
    private IBookTypeService bookTypeService;

    @RequiresPermissions("system:type:view")
    @GetMapping()
    public String type()
    {
        return prefix + "/type";
    }

    /**
     * 查询书籍分类列表
     */
    @RequiresPermissions("system:type:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BookType bookType)
    {
        startPage();
        List<BookType> list = bookTypeService.selectBookTypeList(bookType);
        return getDataTable(list);
    }

    /**
     * 导出书籍分类列表
     */
    @RequiresPermissions("system:type:export")
    @Log(title = "书籍分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BookType bookType)
    {
        List<BookType> list = bookTypeService.selectBookTypeList(bookType);
        ExcelUtil<BookType> util = new ExcelUtil<BookType>(BookType.class);
        return util.exportExcel(list, "书籍分类数据");
    }

    /**
     * 新增书籍分类
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存书籍分类
     */
    @RequiresPermissions("system:type:add")
    @Log(title = "书籍分类", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BookType bookType)
    {
        return toAjax(bookTypeService.insertBookType(bookType));
    }

    /**
     * 修改书籍分类
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BookType bookType = bookTypeService.selectBookTypeById(id);
        mmap.put("bookType", bookType);
        return prefix + "/edit";
    }

    /**
     * 修改保存书籍分类
     */
    @RequiresPermissions("system:type:edit")
    @Log(title = "书籍分类", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BookType bookType)
    {
        return toAjax(bookTypeService.updateBookType(bookType));
    }

    /**
     * 删除书籍分类
     */
    @RequiresPermissions("system:type:remove")
    @Log(title = "书籍分类", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bookTypeService.deleteBookTypeByIds(ids));
    }
}
