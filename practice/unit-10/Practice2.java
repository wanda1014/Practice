package cn.wanda.chapter10;

/**
 * 子类覆盖父类的方法，创建子类对象，调用方法
 */

public class Practice2 {

    public void function1(){
        System.out.println("父类的方法1");
    }

    public void function2(){
        System.out.println("父类的方法2");
    }

    public static void main(String[] args) {
        Practice2 p = new Prctice22();      //子类的对象
        Practice2 p2 = new Practice2();     //父类的对象
        p.function1();
        p.function2();
        System.out.println("-----------");
        p2.function1();
        p2.function2();
    }

}

class Prctice22 extends Practice2{

    public void function2(){
        System.out.println("子类的方法2");
    }

}
