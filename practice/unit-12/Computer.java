package cn.wanda.chapter12;

public class Computer {

    public int getMaxCommNum(int m, int n) throws MyException{

        if(m <= 0 || n <= 0){
            throw new MyException("传递参数不是正整数");
        }
        if(m < n){
            int temp = m;
            m = n;
            n = temp;
        }
        int d = m % n;
        while (d != 0){
            m = n;
            n = d;
            d = m % n;
        }
        return n;

    }

}
