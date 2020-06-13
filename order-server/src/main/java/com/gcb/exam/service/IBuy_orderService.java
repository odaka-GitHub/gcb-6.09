package com.gcb.exam.service;

import com.gcb.exam.entity.Buy_order;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface IBuy_orderService extends IService<Buy_order> {

    List<Buy_order> list();

    Buy_order findOrderStatus(Integer orderStatus);

    Buy_order findOrderCreateTime(String orderCreateTime);

}
