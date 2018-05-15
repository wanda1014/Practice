package cn.wanda.service;

import cn.wanda.entity.Admin;

/**
 * 管理员的service接口
 */

public interface AdminService {

    //根据用户名和密码查找管理员
    Admin findByUserAndPass(Admin admin);

}
