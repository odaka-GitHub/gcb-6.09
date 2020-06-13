package com.gcb.exam.controller;


import com.gcb.exam.entity.Vipcard;
import com.gcb.exam.service.IVipcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@RestController
@RequestMapping("/vipcard")
@CrossOrigin
public class VipcardController {

    //会员管理
    // 增加会员
    //  增加会员时,根据添加的uid查询是否有这个用户
    // 修改会员(只能修改状态)
    //.删除会员(修改会员状态)
    // 全查会员

    @Autowired
    private IVipcardService iVipcardService;

    //查询  会员卡，，对应的使用人名称
    @RequestMapping("/list")
    public List<Vipcard> list() {
        return iVipcardService.list();
    }

    //查看会员个人信息(根据uid)
    @RequestMapping("/findUser")
    public Vipcard list(int uid) {
        return iVipcardService.findVipUser(uid);
    }


    @RequestMapping("/save")
    public void save(@RequestBody Vipcard vipcard) {
        boolean save = iVipcardService.save(vipcard);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Vipcard vipcard) {
        boolean update = iVipcardService.updateById(vipcard);
    }

    @RequestMapping("/deletes")
    public void deletes(Integer id) {
        boolean b = iVipcardService.removeById(id);
    }
}

