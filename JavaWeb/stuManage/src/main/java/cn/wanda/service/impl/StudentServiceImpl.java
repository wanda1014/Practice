package cn.wanda.service.impl;

import cn.wanda.entity.Student;
import cn.wanda.mapper.StudentMapper;
import cn.wanda.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    //注入studentMapper
    @Autowired
    private StudentMapper studentMapper;

    //查找所有的学生
    @Override
    public List<Student> findStudent(String studentId) {
        return studentMapper.findStudent(studentId);
    }

    //根据学号id查找学生
    @Override
    public Student findById(String studentId) {
        return studentMapper.findById(studentId);
    }

    //添加学生
    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    //根据学号id删除学生
    @Override
    public void delete(String studentId) {
        studentMapper.delete(studentId);
    }

    //更新学生
    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }
}
