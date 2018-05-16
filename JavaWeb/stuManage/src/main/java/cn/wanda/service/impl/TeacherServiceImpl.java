package cn.wanda.service.impl;

/**
 * 老师service接口的实现类
 */

import cn.wanda.entity.Teacher;
import cn.wanda.mapper.TeacherMapper;
import cn.wanda.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    //注入teacherMapper
    @Autowired
    TeacherMapper teacherMapper;

    //查找所有的老师
    @Override
    public List<Teacher> findAllTeacher() {
        return teacherMapper.findAllTeacher();
    }
}
