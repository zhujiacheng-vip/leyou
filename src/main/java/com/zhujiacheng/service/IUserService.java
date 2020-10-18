package com.zhujiacheng.service;

import com.zhujiacheng.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhujiacheng
 * @since 2020-10-15
 */
public interface IUserService extends IService<User> {

    //根据父id查询对象
    List<User> getParent(Integer pid);

}
