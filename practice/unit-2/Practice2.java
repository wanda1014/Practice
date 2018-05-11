package cn.wanda.chapter3;

public class Practice2 {

    static int age = 26;   //成员变量

    public static void test(){
        int age = 50;   //局部变量
        String name = "test";   //局部变量
    }

    public static void main(String[] args) {

        String name = "wanda";
        System.out.println(name + "的年龄是" + age);

    }

}
