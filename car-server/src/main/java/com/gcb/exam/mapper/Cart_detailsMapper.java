package com.gcb.exam.mapper;

import com.gcb.exam.entity.CartDetailsVo;
import com.gcb.exam.entity.Cart_details;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface Cart_detailsMapper extends BaseMapper<Cart_details> {

    @Select("select * from t_cart_details c , t_goods  g , t_vipuser v  where c.gid= g.id and c.uid = v.id ")
    List<CartDetailsVo> list();
}
