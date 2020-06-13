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

import javax.persistence.Table;
import javax.persistence.Transient;

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
@TableName("t_vipcard")
public class Vipcard implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会员卡名
     */
    @TableField(value = "vipcardName")
    private String vipcardName;

    /**
     * 会员卡等级
     */
    @TableField(value = "vipcardLv")
    private String vipcardLv;

    /**
     * 会员卡颜色
     */
    private String vipcardcolor;

    /**
     * 会员卡类型
     */
    @TableField(value = "vipcardType")
    private String vipcardType;

    /**
     * 会员卡创建时间
     */
    @TableField(value = "vipcardCreatime")
    private LocalDate vipcardCreatime;

    /**
     * 会员卡创建人
     */
    @TableField(value = "vipcardCreatPeople")
    private String vipcardCreatPeople;

    /**
     * 修改时间
     */
    @TableField(value = "editTime")
    private LocalDate editTime;

    /**
     * 修改人
     */
    @TableField(value = "editPeople")
    private String editPeople;

    /**
     * 对应会员人
     */
    private Integer uid;
    private String name;
}
