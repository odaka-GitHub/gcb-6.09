package com.gcb.exam.service.impl;

import com.gcb.exam.entity.Buy_order;
import com.gcb.exam.mapper.Buy_orderMapper;
import com.gcb.exam.service.IBuy_orderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@Service
public class Buy_orderServiceImpl extends ServiceImpl<Buy_orderMapper, Buy_order> implements IBuy_orderService {

    @Autowired
    private Buy_orderMapper buy_orderMapper;

    @Override
    public List<Buy_order> list() {
        return buy_orderMapper.list();
    }

    @Override
    public Buy_order findOrderStatus(Integer orderStatus) {
        return buy_orderMapper.findOrderStatus(orderStatus);
    }

    @Override
    public Buy_order findOrderCreateTime(String orderCreateTime) {
        return buy_orderMapper.findOrderCreateTime(orderCreateTime);
    }


}
