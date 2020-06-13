package com.gcb.exam.controller;


import com.gcb.exam.entity.Cart;
import com.gcb.exam.entity.CartDetailsVo;
import com.gcb.exam.entity.Cart_details;
import com.gcb.exam.entity.Goods;
import com.gcb.exam.mapper.Cart_detailsMapper;
import com.gcb.exam.service.ICartService;
import com.gcb.exam.service.ICart_detailsService;
import com.gcb.exam.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
@RequestMapping("/cart_details")
@CrossOrigin
public class Cart_detailsController {
    @Autowired
    private ICart_detailsService iCart_detailsService;

    @Autowired
    private ICartService iCartService;

    @Autowired
    private Cart_detailsMapper cart_detailsMapper;

    @RequestMapping("/list")
    public List<CartDetailsVo> list() {
        return cart_detailsMapper.list();
    }



}

