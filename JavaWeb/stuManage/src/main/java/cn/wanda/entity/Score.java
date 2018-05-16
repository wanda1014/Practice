package cn.wanda.entity;

/**
 * 课程分数的实体类
 */

public class Score {
    private int id;             //表的id

    private String studentId;   //学生学号

    private float chinese;      //语文成绩

    private float math;         //数学成绩

    private float english;      //英语成绩

    public Score() {
    }

    //有参构造器
    public Score(int id, String studentId, float chinese, float math, float english) {
        this.id = id;
        this.studentId = studentId;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }
}
