package cn.wanda.chapter18;

/**
 * 定义一个继承Thread类的类，并覆盖run()方法，在run()方法中每隔100毫秒打印一句话
 */

public class Practice1 extends Thread{

    int index = 0;
    //打印文字的集合
    String[] str = {"测试1","测试2","测试3","测试4","测试5"};

    //重写run()方法
    @Override
    public void run() {
        while (true){
            System.out.println(str[index++%5]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //开始线程
        new Practice1().start();
    }

}
