package cn.wanda.mapper;

import cn.wanda.entity.Admin;

/**
 * 管理员的mapper接口
 */

public interface AdminMapper {

    //根据用户名和密码查找管理员
    Admin findByUserAndPass(Admin admin);

}
