package cn.wanda.chapter10;

/**
 * 总结：1、先执行父类的构造方法
 *       2、构造方法中如果遇到类中的方法，并在子类中进行重写，那么先执行子类的方法
 *       3、接着执行完父类的构造方法，再执行子类的构造方法
 *       4、再执行子类成员变量的初始化
 */

public class Practice3 {
    //父类的构造方法
    Practice3(){
        System.out.println("before function()");
        System.out.println("父类的构造方法");
        function();
        System.out.println("after function()");
    }
    //父类的方法
    public void function(){
        System.out.println("父类的function()");
    }

    public static void main(String[] args) {
        new Practice33();
    }

}

class Practice33 extends Practice3{
    //成员变量
    private int i = 5;
    //重写父类的方法
    public void function(){
        System.out.println("子类的function()" + i);
    }
    //子类的构造方法
    Practice33(){
        System.out.println("子类的构造方法");
    }
}
