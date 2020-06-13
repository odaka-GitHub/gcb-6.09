package com.gcb.exam.mapper;

import com.gcb.exam.entity.Inventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface InventoryMapper extends BaseMapper<Inventory> {


    @Select("select  goodsNum from t_inventory ")
    Inventory selectGoodsNumByInv();

}
