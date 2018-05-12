package cn.wanda.chapter18;

/**
 * 设计四个线程对象
 * 两个线程执行减操作，两个线程执行加操作
 */

public class Practice2 {

    public static void main(String[] args) {
        Calc c = new Calc();
        Add add = new Add(c);
        Dec dec = new Dec(c);
        for (int i = 0; i < 4; i++) {
            //启动线程
            new Thread(add,"线程A").start();
            new Thread(dec,"线程B").start();
            new Thread(add,"线程C").start();
            new Thread(dec,"线程D").start();
        }
    }

}

/**
 * Calc类用来定义加方法和减方法
 */
class Calc{
    private int j = 0;

    public synchronized void add(){
        //打印线程的名字和对应时刻j的值
        System.out.println(Thread.currentThread().getName() + "对j加1，j = " + (++j));
    }

    public synchronized void dec(){
        System.out.println(Thread.currentThread().getName() + "对j减1，j = " + (--j));
    }
}

/**
 * Add类实现加方法的线程
 */
class Add implements Runnable{
    private Calc c;
    Add(Calc c){
        this.c = c;
    }
    @Override
    public void run() {
        c.add();
    }
}

/**
 * Dec类实现减方法的线程
 */
class Dec implements Runnable{
    private Calc c;
    Dec(Calc c){
        this.c = c;
    }
    @Override
    public void run() {
        c.dec();
    }
}
