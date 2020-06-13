package com.gcb.exam.service;

import com.gcb.exam.entity.Cart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gcb.exam.entity.CartVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface ICartService extends IService<Cart> {

    boolean insertReturnId(CartVo cartVo);


    Cart selectNumberByCart(Integer number);
}
