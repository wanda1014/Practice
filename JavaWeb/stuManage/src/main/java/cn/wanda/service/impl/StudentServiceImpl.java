package cn.wanda.service.impl;

import cn.wanda.entity.Student;
import cn.wanda.mapper.StudentMapper;
import cn.wanda.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findStudent(String studentId) {
        return studentMapper.findStudent(studentId);
    }

    @Override
    public Student findById(String studentId) {
        return studentMapper.findById(studentId);
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @Override
    public void delete(String studentId) {
        studentMapper.delete(studentId);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }
}
