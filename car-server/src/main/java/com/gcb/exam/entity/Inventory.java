package com.gcb.exam.entity;

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
@TableName("t_inventory")
public class Inventory implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 商品价格
     */
    private Integer goodsPrice;

    /**
     * 商品状态
     */
    private Integer goodsStatus;

    /**
     * 商品创建时间
     */
    private LocalDate goodsCreateTime;

    /**
     * 商品创建人
     */
    private String goodsCreatePeople;

    /**
     * 商品修改时间
     */
    private LocalDate goodsEditTime;

    /**
     * 商品修改人
     */
    private String goodsEditPeople;


}
