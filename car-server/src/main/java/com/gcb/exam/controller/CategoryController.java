package com.gcb.exam.controller;


import com.gcb.exam.entity.Category;
import com.gcb.exam.entity.Goods;
import com.gcb.exam.service.ICategoryService;
import com.gcb.exam.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("/list")
    public List<Category> list() {
        return iCategoryService.list();
    }

}

