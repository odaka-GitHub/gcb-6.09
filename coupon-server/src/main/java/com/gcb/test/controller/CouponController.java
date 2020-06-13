package com.gcb.test.controller;


import com.gcb.test.entity.Coupon;
import com.gcb.test.entity.vo.ResultEntity;
import com.gcb.test.service.ICouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-06-12
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private ICouponService iCouponService;


    @RequestMapping("/list")
    public List<Coupon> list() {
        List<Coupon> coupons = iCouponService.lista();
        return coupons;
    }

    //直接   添加优惠券
    @RequestMapping("/save")
    public ResultEntity save(@RequestBody Coupon coupon) {
        boolean save = iCouponService.save(coupon);
        return ResultEntity.ok(save);
    }

    // 删除优惠券
    @RequestMapping("/delete")
    public ResultEntity delete(Integer id) {
        boolean delete = iCouponService.removeById(id);
        return ResultEntity.ok(delete);
    }

    //修改优惠券
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Coupon coupon) {
        boolean update = iCouponService.updateById(coupon);
        return ResultEntity.ok(update);
    }


    // 查询 优惠券 所属用户
    @RequestMapping("/selectUid")
    public ResultEntity update(Integer uid) {
        Coupon coupon = iCouponService.selectVipUserByUid(uid);
        return ResultEntity.ok(coupon);
    }


    @RequestMapping("/aaa")
    public String update() {
        return "dwawda";
    }
}

