package cn.wanda.entity;

/**
 * 学生个人信息的实体类
 */

public class Student {

    private String studentId;       //学号

    private String studentName;     //姓名

    private int age;                //年龄

    //无参构造器
    public Student() {
    }

    //有参构造器
    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
