package cn.wanda.chapter11;

/**
 * 编写一个内部类，主方法中创建内部类的实例
 */

public class Practice3 {

    static class InnerClass{
        void function(){
            System.out.println("内部类的方法");
        }
    }

    public static void main(String[] args) {

        new InnerClass().function();

    }

}
