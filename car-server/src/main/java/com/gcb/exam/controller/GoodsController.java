package com.gcb.exam.controller;


import com.gcb.exam.entity.Goods;
import com.gcb.exam.service.IGoodsService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping("/list")
    public List<Goods> list() {
        return iGoodsService.list();
    }

    @RequestMapping("/deletes")
    public void deletes(Integer id) {
        iGoodsService.removeById(id);
    }

    @RequestMapping("/save")
    public void save(@RequestBody Goods goods) {
        iGoodsService.save(goods);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Goods goods) {
        iGoodsService.updateById(goods);
    }
}

