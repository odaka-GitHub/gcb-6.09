package com.gcb.test.service.impl;

import com.gcb.test.entity.Coupon;
import com.gcb.test.mapper.CouponMapper;
import com.gcb.test.service.ICouponService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-12
 */
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements ICouponService {

    @Autowired
    private CouponMapper couponMapper;


    @Override
    public Coupon selectVipUserByUid(Integer uid) {
        return couponMapper.selectVipUserByUid(uid);
    }

    @Override
    public List<Coupon> lista() {
        return couponMapper.lista();
    }
}
