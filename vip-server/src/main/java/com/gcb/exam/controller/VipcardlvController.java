package com.gcb.exam.controller;


import com.gcb.exam.entity.Vipcard;
import com.gcb.exam.entity.Vipcardlv;
import com.gcb.exam.service.IVipcardService;
import com.gcb.exam.service.IVipcardlvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-06-09
 */
@RestController
@RequestMapping("/vipcardlv")
public class VipcardlvController {

    //等级

    @Autowired
    private IVipcardlvService iVipcardlvService;

    @RequestMapping("/list")
    public List<Vipcardlv> list() {
        return iVipcardlvService.list();
    }

    @RequestMapping("/save")
    public void save(@RequestBody Vipcardlv vipcard) {
        boolean save = iVipcardlvService.save(vipcard);
    }

    @RequestMapping("/update")
    public void update(@RequestBody Vipcardlv vipcard) {
        boolean update = iVipcardlvService.updateById(vipcard);
    }

    @RequestMapping("/deletes")
    public void deletes(Integer id) {
        boolean b = iVipcardlvService.removeById(id);
    }




}

