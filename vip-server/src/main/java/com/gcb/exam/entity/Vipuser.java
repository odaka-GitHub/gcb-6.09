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
@TableName("t_vipuser")
public class Vipuser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 会员名称
     */
    private String name;

    /**
     * 会员年龄
     */
    private Integer age;

    /**
     * 会员性别
     */
    private String sex;

    /**
     * 会员爱好
     */
    private String hobby;

    /**
     * 会员生日
     */
    private LocalDate birthday;


}
