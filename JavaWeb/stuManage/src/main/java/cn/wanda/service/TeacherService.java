package cn.wanda.service;

import cn.wanda.entity.Teacher;

import java.util.List;

/**
 * 老师的service接口
 */

public interface TeacherService {

    //查找所有的老师
    List<Teacher> findAllTeacher();
}
