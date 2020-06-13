package com.gcb.exam.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Table;

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
@TableName("t_buy_order")
public class Buy_order implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String remark;

    @TableField(value = "orderNum")
    private Integer orderNum;

    @TableField(value = "orderPrice")
    private Integer orderPrice;

    private Integer uid;

    @TableField(value = "orderName")
    private String orderName;


    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(value = "orderCreateTime")
    private Date orderCreateTime;

    @TableField(value = "orderCreatePeople")
    private String orderCreatePeople;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField(value = "orderEditTime")
    private Date orderEditTime;
    @TableField(value = "orderEditPeople")
    private String orderEditPeople;


    @TableField(value = "orderStatus")
    private Integer orderStatus;
}
