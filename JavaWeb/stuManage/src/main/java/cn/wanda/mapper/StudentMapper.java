package cn.wanda.mapper;

import cn.wanda.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> findStudent(@Param("studentId") String studentId);

    Student findById(@Param("studentId") String studentId);

    void addStudent(Student student);

    void delete(@Param("studentId") String studentId);

    void update(Student student);
}
