package cn.wanda.chapter12;

/**
 * speak方法中如果m>1000抛出自定义的异常
 */

public class Practice1 {

    public static void main(String[] args) {

        Student s = new Student();
        try {
            s.speak(1999);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

}
