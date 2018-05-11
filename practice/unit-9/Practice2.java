package cn.wanda.chapter9;

import java.text.DecimalFormat;

/**
 * 定义一个求圆面积的方法，结果保留5位小数 P160页
 */

public class Practice2 {

    public static void SimgleFormat(String pattern, double value){
        DecimalFormat format = new DecimalFormat(pattern);
        String output = format.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    public static double GetArea(double r){
        double area = Math.PI * Math.pow(r,2);
        return area;
    }

    public static void main(String[] args) {

        SimgleFormat("#.#####",GetArea(5.2));

    }

}
