package cn.wanda.entity;

/**
 * 后台管理老师的实体类
 */

public class Teacher {

    private int id;

    private String name;        //姓名

    public Teacher() {
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
