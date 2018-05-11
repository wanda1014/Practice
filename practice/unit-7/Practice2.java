package cn.wanda.chapter7;

/**
 * 求圆的面积
 */

public class Practice2 {

    private double length;
    private double width;

    public Practice2(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public static void main(String[] args) {
        Practice2 p = new Practice2(3.4, 1.8);
        double s = p.getArea();
        System.out.println(s);
    }

}
