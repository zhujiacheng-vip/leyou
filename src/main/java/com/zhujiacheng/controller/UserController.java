package com.zhujiacheng.controller;


import com.zhujiacheng.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhujiacheng
 * @since 2020-10-15
 */
@RestController
public class UserController {

    @Resource
    private IUserService iUserService;

    @GetMapping("test")
    public String test(){

        return "hello word";
    }


}
