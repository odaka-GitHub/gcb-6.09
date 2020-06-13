package com.gcb.exam.service;

import com.gcb.exam.entity.Vipcard;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
public interface IVipcardService extends IService<Vipcard> {
    List<Vipcard> list();

    Vipcard findVipUser(int uid);
}
