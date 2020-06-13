package com.gcb.exam.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcb.exam.entity.*;
import com.gcb.exam.mapper.CartMapper;
import com.gcb.exam.mapper.Cart_detailsMapper;
import com.gcb.exam.mapper.GoodsMapper;
import com.gcb.exam.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gzp
 * @since 2020-06-04
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private Cart_detailsMapper cart_detailsMapper;
    @Override
    public boolean insertReturnId(CartVo cartVo) {
        Cart cart=new Cart();
        cart.setPrice(cartVo.getPrice());
        cart.setNumber(cartVo.getNumber());
        cart.setUid(cartVo.getUid());

        Integer saveid;
        QueryWrapper<Cart> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("uid",cart.getUid());
        Cart cart1 = cartMapper.selectOne(queryWrapper);
        if (cart1!=null){
            Cart_details cart_details = new Cart_details();
            if (cart_details != null) {
                if (cart_details.getNumber() < 99) {
                    cart.setNumber(cart_details.getNumber());
                    cart.setPrice(cart_details.getNumber() * cart_details.getPrice());

                    cart_detailsMapper.insert(cart_details);
                } else {
                    System.out.println("购物车中的商品数量上限为99");
                }
            }
        }else {
            saveid = cartMapper.insert(cart);
        }
        //根据id查询 商品信息
        Goods goods = goodsMapper.selectById(cartVo.getGid());
        //添加购物车明细
        Cart_details details = new Cart_details();
        details.setGid(goods.getId());
        details.setNumber(cartVo.getNumber());
        details.setGname(goods.getGoodsName());
        details.setPrice(cartVo.getPrice());
        details.setCreatedate(new Date());
        details.setUid(cart.getUid());
        Integer insert = cart_detailsMapper.insert(details);
        if(insert!=null){
            return true;
        }
        return false;
    }

    @Override
    public Cart selectNumberByCart(Integer number) {
        return cartMapper.selectNumberByCart(number);
    }
}
