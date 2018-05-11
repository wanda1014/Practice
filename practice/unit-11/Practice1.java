package cn.wanda.chapter11;

/**
 * 方法中编写一个匿名类
 */

public class Practice1 {
    public static void main(String[] args) {
        new OuterClass().doit().getValue();
    }
}

interface OutInterface{     //定义一个接口
    int getValue();         //接口内定义一个方法
}

class OuterClass{           //定义一个外部类
    public OutInterface doit(){         //返回接口对象的方法

        return new OutInterface() {     //匿名内部类
            private int i = 2;
            public int getValue(){      //实现接口中的方法
                System.out.println(i);
                return i;
            }
        };

    }
}
