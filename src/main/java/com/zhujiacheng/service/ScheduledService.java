package com.zhujiacheng.service;

import javax.annotation.Resource;

/**
 * @Author Mr zhu
 * @Date 2020/10/26 18:54
 *定时任务
 */
public interface ScheduledService {

    //根据用户的状态进行定时清除
    void deleteUsers();

}
