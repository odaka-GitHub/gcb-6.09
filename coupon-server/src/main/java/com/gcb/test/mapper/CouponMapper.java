package com.gcb.test.mapper;

import com.gcb.test.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-12
 */
public interface CouponMapper extends BaseMapper<Coupon> {

    Coupon selectVipUserByUid(Integer uid);


    @Select("select * from t_coupon")
    List< Coupon> lista();

}
