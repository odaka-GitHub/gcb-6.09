package com.gcb.exam.mapper;

import com.gcb.exam.entity.Vipcard;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface VipcardMapper extends BaseMapper<Vipcard> {

    List<Vipcard> list();

    Vipcard findVipUser(int uid);
}
