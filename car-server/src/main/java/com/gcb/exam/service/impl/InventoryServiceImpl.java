package com.gcb.exam.service.impl;

import com.gcb.exam.entity.Inventory;
import com.gcb.exam.mapper.InventoryMapper;
import com.gcb.exam.service.IInventoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory> implements IInventoryService {


    @Autowired
    private InventoryMapper inventoryMapper;


    @Override
    public Inventory selectGoodsNumByInv() {
        return inventoryMapper.selectGoodsNumByInv();
    }
}
