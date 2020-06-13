package com.gcb.exam.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 高淙博
 * @data 2020/06/09 13:49
 */
@Data
public class CartDetailsVo implements Serializable {
    private Date createdate;
    private String img;
    private String goodsName;
    private Integer goodsPrice;
    private String goodsStatus;
    private String goodsType;
    private String goodsCreateTime;
    private String goodsCreatePeople;
    private String goodsEditTime;
    private String goodsEditPeople;
    private String name;
    private String age;
    private String sex;
    private String hobby;
    private Date birthday;
}
