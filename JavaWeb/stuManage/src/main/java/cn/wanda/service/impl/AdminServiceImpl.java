package cn.wanda.service.impl;

/**
 * 管理员service接口的实现类
 */

import cn.wanda.entity.Admin;
import cn.wanda.mapper.AdminMapper;
import cn.wanda.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {

    //注入adminMapper
    @Autowired
    private AdminMapper adminMapper;

    //根据用户名和密码查找管理员
    @Override
    public Admin findByUserAndPass(Admin admin) {
        return adminMapper.findByUserAndPass(admin);
    }
}
