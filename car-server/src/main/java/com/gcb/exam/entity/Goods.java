package com.gcb.exam.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
 * @since 2020-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    @TableField(value = "goodsName")
    private String goodsName;

    /**
     * 商品价格
     */
    @TableField(value = "goodsPrice")
    private String goodsPrice;

    /**
     * 0/1 上架，下架
     */
    @TableField(value = "goodsStatus")
    private Integer goodsStatus;

    /**
     * 分类id
     */
    private Integer cid;

    /**
     * 商品类型
     */
    @TableField(value = "goodsType")
    private String goodsType;
    private String img;
    /**
     * 商品创建时间
     */
    @TableField(value = "goodsCreateTime")
    private LocalDate goodsCreateTime;

    /**
     * 商品创建人
     */
    @TableField(value = "goodsCreatePeople")
    private String goodsCreatePeople;

    /**
     * 商品修改时间
     */
    @TableField(value = "goodsEditTime")
    private LocalDate goodsEditTime;

    /**
     * 商品修改人
     */
    @TableField(value = "goodsEditPeople")
    private String goodsEditPeople;

}
