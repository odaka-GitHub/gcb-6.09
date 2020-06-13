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
@TableName("t_vipcardlv")
public class Vipcardlv implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会员卡等级名称
     *
     * 等级 升级记录，
     *
     * 会员权益
     *
     * 等级  阶段
     *
     *
     */
    private String vipLvName;

    /**
     * 会员卡等级类型
     */
    private String vipLvType;

    /**
     * 会员卡等级创建时间
     */
    private LocalDate vipLvCreateTime;

    /**
     * 会员卡等级创建人
     */
    private String vipLvCreatePeople;

    /**
     * 会员卡等级修改人
     */
    private LocalDate editvipLvTime;

    /**
     * 会员卡等级修改人
     */
    private String editvipLvPeople;


}
