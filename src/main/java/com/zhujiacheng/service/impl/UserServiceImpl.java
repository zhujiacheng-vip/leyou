package com.zhujiacheng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhujiacheng.pojo.User;
import com.zhujiacheng.dao.UserMapper;
import com.zhujiacheng.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.function.IntUnaryOperator;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhujiacheng
 * @since 2020-10-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private IUserService iUserService;

    @Override
    public List<User> getParent(Integer pid) {

        QueryWrapper queryWrapper = new QueryWrapper();

        queryWrapper.eq("pid",pid);

        List list = iUserService.list(queryWrapper);

        return list;

    }
}
