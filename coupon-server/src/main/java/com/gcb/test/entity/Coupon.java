package com.gcb.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2020-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_coupon")
public class Coupon extends Vipuser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer sid;

    /**
     * 面额
     */
    private String denomination;

    /**
     * 只能领取一次
     */
    @TableField(value = "getStatus")
    private String getStatus;

    @TableField(value = "limitEd")
    private String limitEd;

    @TableField(value = "OrderStatus")
    private String OrderStatus;

}
