package cn.wanda.service;

import cn.wanda.entity.Student;

import java.util.List;

/**
 * 学生的service接口
 */

public interface StudentService {

    //查找所有的学生
    List<Student> findStudent(String studentId);

    //根据学号id查找学生
    Student findById(String studentId);

    //添加学生
    void addStudent(Student student);

    //根据学号id删除学生
    void delete(String studentId);

    //更新学生
    void update(Student student);
}
