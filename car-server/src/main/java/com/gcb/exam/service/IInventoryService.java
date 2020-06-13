package com.gcb.exam.service;

import com.gcb.exam.entity.Inventory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface IInventoryService extends IService<Inventory> {
    Inventory selectGoodsNumByInv();
}
