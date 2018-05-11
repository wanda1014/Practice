package cn.wanda.chapter12;

/**
 * try-catch语句似乎不起作用，超过int范围后变为负数也不抛出异常
 */

public class Practice2 {

    public static void main(String[] args) {

        try {
            System.out.println(new Number().count(1111222,1256888957));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
