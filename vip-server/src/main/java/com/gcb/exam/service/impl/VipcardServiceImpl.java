package com.gcb.exam.service.impl;

import com.gcb.exam.entity.Vipcard;
import com.gcb.exam.mapper.VipcardMapper;
import com.gcb.exam.service.IVipcardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@Service
public class VipcardServiceImpl extends ServiceImpl<VipcardMapper, Vipcard> implements IVipcardService {

    @Autowired
    private VipcardMapper vipcardMapper;

    @Override
    public List<Vipcard> list() {
        List<Vipcard> list = vipcardMapper.list();
        return list;
    }

    @Override
    public Vipcard findVipUser(int uid) {
        return vipcardMapper.findVipUser(uid);
    }
}
