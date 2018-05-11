package cn.wanda.chapter12;

/**
 * 最大公约数，自定义异常
 */

public class Practice3 {

    public static void main(String[] args) {

        Computer c = new Computer();
        try {
            System.out.println(c.getMaxCommNum(15, 0));
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

}
