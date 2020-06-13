package com.gcb.exam.controller;


import com.gcb.exam.entity.Vipcard;
import com.gcb.exam.entity.Vipuser;
import com.gcb.exam.service.IVipcardService;
import com.gcb.exam.service.IVipuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@RequestMapping("/vipuser")
@CrossOrigin
public class VipuserController {
    @Autowired
    private IVipuserService iVipuserService;


    @RequestMapping("/list")
    public List<Vipuser> list() {
        return iVipuserService.list();
    }

    @RequestMapping("/save")
    public void save(@RequestBody Vipuser vipuser) {
        boolean save = iVipuserService.save(vipuser);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Vipuser vipuser) {
        boolean update = iVipuserService.updateById(vipuser);
    }

    @RequestMapping("/deletes")
    public void deletes(Integer id) {
        boolean b = iVipuserService.removeById(id);
    }
}

