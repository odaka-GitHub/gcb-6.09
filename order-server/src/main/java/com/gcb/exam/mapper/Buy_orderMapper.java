package com.gcb.exam.mapper;

import com.gcb.exam.entity.Buy_order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface Buy_orderMapper extends BaseMapper<Buy_order> {

    @Select("select *from t_buy_order")
    List<Buy_order> list();


    //查看订单状态
    @Select("  select * from t_buy_order where orderStatus =#{orderStatus}")
    Buy_order findOrderStatus(Integer orderStatus);

    //查看 下单时间
    @Select("select * from t_buy_order where orderCreateTime ='2020-06-10'")
    Buy_order findOrderCreateTime(String orderCreateTime);

}
