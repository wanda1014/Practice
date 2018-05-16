package cn.wanda.mapper;

import cn.wanda.entity.Teacher;

import java.util.List;

/**
 * 老师的mapper
 */

public interface TeacherMapper {

    //查找所有的老师
    List<Teacher> findAllTeacher();
}
