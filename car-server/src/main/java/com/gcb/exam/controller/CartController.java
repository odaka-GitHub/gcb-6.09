package com.gcb.exam.controller;


import com.gcb.exam.entity.*;
import com.gcb.exam.service.ICartService;
import com.gcb.exam.service.ICategoryService;
import com.gcb.exam.service.IInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/cart")
@CrossOrigin
public class CartController {
    @Autowired
    private ICartService iCartService;


    @Autowired
    private IInventoryService iInventoryService;

    @RequestMapping("/list")
    public List<Cart> list() {
        return iCartService.list();
    }
    //购物车种的商品信息可以一次性购买多件进行结算
    //查看购物车中 ，是否存在 这件商品，如果存在，则数量+1
    //                               如果不存在，则添加到购物车，购物车明细。


    //购物车的 商品数量不能超过 99

    // 第一步：先查出一共有多少件商品数量。
    //第二步， 用要添加的    商品数量 + 上已有的商品数量。
    // 两种条件：  如果商品数量 >90  提示购物车数量，已经满了。
    //            如果商品数量 <90   看看库存量 是否充足。
    // 如果商品数量，充足，直接 从库存表添加到销售单表，
    // 如果不充足，查看是否可以为负值，
    // 可以为负值，则生成 紧急采购，  不可以为负值，则提示！

    @RequestMapping("/save")
    public ResultEntity save(Integer number) {
        //第一步：先查出一共有多少件商品数量。
        Cart cart = iCartService.selectNumberByCart(number);

        Cart cart1 = new Cart();
        Cart_details cart_details = new Cart_details();

        //购物车 添加完此商品后 数量 和
        int num = cart1.getNumber() + cart_details.getNumber();

        if (num < 90) {
            //查一下存储数量
            Inventory inventory = iInventoryService.selectGoodsNumByInv();
            //库存量 > 买后的量
            if (inventory.getGoodsNum() > num) {
                //生成购物车表数据
                Cart cart2 = new Cart();
                cart2.setPrice(inventory.getGoodsPrice() * inventory.getGoodsNum());
                cart2.setNumber(inventory.getGoodsNum());
                iCartService.save(cart);
            } else {
                System.out.println("紧急采购");
            }

        } else {
            System.out.println("提示购物车数量 >90，已经满了,");
        }

        return ResultEntity.ok(cart);

    }


}

