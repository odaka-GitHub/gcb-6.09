package com.gcb.exam.controller;


import com.gcb.exam.entity.Buy_order;
import com.gcb.exam.entity.Seller_order;
import com.gcb.exam.service.IBuy_orderService;
import com.gcb.exam.service.ISeller_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
@RequestMapping("/buy_order")
public class Buy_orderController {


    @Autowired
    private IBuy_orderService iBuy_orderService;

    @Autowired
    private ISeller_orderService iSeller_orderService;

    @RequestMapping("/saveOne")
    public void save(Integer uid, Integer orderStatus, String orderCreateTime) {
        //下单成功未支付的订单半小时提醒用户进行支付
        //1. 先查查看订单状态是否  支付了
        //   1.1如果支付了，
        //   生成 生成卖家的数据，放进卖家的 数据库列表。
        //   1.2如果未支付，
        //   使用定时任务，，半小时提醒用户进行支付

        //先查出订单状态。
        Buy_order orderStatus1 = iBuy_orderService.findOrderStatus(orderStatus);
        //状态为 1 ，代表已经支付
        if (orderStatus1.getOrderStatus() == 1) {

            //添加订单 到 卖家订单
            Seller_order seller_order = new Seller_order();
            Buy_order buy_order = new Buy_order();

            seller_order.setOrderNum(buy_order.getOrderNum());
            seller_order.setOrderName(buy_order.getOrderName());
            seller_order.setOrderPrice(buy_order.getOrderPrice());
            seller_order.setCreatePeople(buy_order.getOrderCreatePeople());
            seller_order.setCreateTime(buy_order.getOrderCreateTime());
            seller_order.setEditPeople(buy_order.getOrderEditPeople());
            seller_order.setEditTime(buy_order.getOrderEditTime());

            //添加 到 卖家     订单
            iSeller_orderService.save(seller_order);

        } else {
            //如果未支付，半小时提醒用户进行支付
        }
    }


    @RequestMapping("/list")
    public List<Buy_order> list() {
        List<Buy_order> list = iBuy_orderService.list();
        return list;
    }


    @RequestMapping("/deletes")
    public void deletes(Integer id) {
        iBuy_orderService.removeById(id);
    }


    @RequestMapping("/update")
    public void update(@RequestBody Buy_order buy_order) {
        boolean save = iBuy_orderService.updateById(buy_order);
    }

}

