package com.gcb.test.service;

import com.gcb.test.entity.Coupon;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-12
 */
public interface ICouponService extends IService<Coupon> {

    Coupon selectVipUserByUid(Integer uid );

    List< Coupon> lista();

}
