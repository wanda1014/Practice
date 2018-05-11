package cn.wanda.chapter9;
/**
 * BigDecimal类中divide()方法的多种处理模式，P173页
 */

import java.math.BigDecimal;

public class Practice3 {

    public BigDecimal div(double value1, double value2, int b, int model){
        if(b < 0){
            System.out.println("b的值必须大于0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));

        return b1.divide(b2,b,model);
    }

    public static void main(String[] args) {

        Practice3 p = new Practice3();
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_CEILING));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_DOWN));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_FLOOR));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_EVEN));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_HALF_UP));
        System.out.println(p.div(-7.5, 8.9, 5, BigDecimal.ROUND_UP));

    }

}
