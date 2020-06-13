package com.gcb.exam.entity;

import com.gcb.exam.entity.Cart;
import lombok.Data;

import java.util.List;

@Data
public class CartVo extends Cart {
    private Integer sid;

    private Integer gid;
}
