package cn.wanda.service;

import cn.wanda.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStudent(String studentId);

    Student findById(String studentId);

    void addStudent(Student student);

    void delete(String studentId);

    void update(Student student);
}
