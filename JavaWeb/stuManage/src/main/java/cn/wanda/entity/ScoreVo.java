package cn.wanda.entity;

/**
 * 联合查询分数的类
 */

public class ScoreVo extends Score {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
