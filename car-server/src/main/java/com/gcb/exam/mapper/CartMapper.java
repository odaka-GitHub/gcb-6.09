package com.gcb.exam.mapper;

import com.gcb.exam.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gcb.exam.entity.CartVo;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface CartMapper extends BaseMapper<Cart> {


    boolean insertReturnId(CartVo cartVo);


    @Select("select *from t_cart where number = #{number}")
    Cart selectNumberByCart(Integer number);
}
