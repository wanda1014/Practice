package cn.wanda.mapper;

/**
 * 学生的mapper
 */

import cn.wanda.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    //查找所有的学生
    List<Student> findStudent(@Param("studentId") String studentId);

    //根据学号id查找学生
    Student findById(@Param("studentId") String studentId);

    //添加学生
    void addStudent(Student student);

    //根据学号id删除学生
    void delete(@Param("studentId") String studentId);

    //更新学生
    void update(Student student);
}
