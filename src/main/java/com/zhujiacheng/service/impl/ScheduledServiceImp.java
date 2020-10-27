package com.zhujiacheng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhujiacheng.pojo.User;
import com.zhujiacheng.service.IUserService;
import com.zhujiacheng.service.ScheduledService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Mr zhu
 * @Date 2020/10/26 18:57
 */
@Slf4j
@Component
public class ScheduledServiceImp implements ScheduledService {


    @Resource
    private IUserService iUserService;

    @Override
    @Scheduled(cron = "0/5 * * * * *")
    public void deleteUsers() {

        QueryWrapper queryWrapper = new QueryWrapper(new User());

        queryWrapper.eq("status",0);

        iUserService.remove(queryWrapper);

        log.info("开始清除用户");

    }
}
