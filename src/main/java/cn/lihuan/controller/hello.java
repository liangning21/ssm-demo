package cn.lihuan.controller;

import cn.lihuan.entity.jobs;
import cn.lihuan.service.JobSeivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

    @Autowired
    private JobSeivce aaaaa;

    @ResponseBody
    @RequestMapping("/hello")
    public jobs getbu(@RequestParam("id") Integer id){
        jobs byList = aaaaa.getByList(id);

        return  byList;
    }

}
