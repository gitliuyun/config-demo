package com.liuyun.demo.controller;

import com.example.myDemo.DemoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weizhenyang
 * @Date: 2021/11/16 10:28
 * @Description:
 */

@RestController
@RequestMapping("")
@ComponentScan({"com.example.myDemo"})
public class ConfigController {

    @PostMapping("/getConfig")
    public String getConfig(){
        return DemoConfig.hostName;
    }
}