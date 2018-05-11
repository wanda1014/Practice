package cn.wanda.chapter12;

public class Student{

    public void speak(int m) throws MyException{
        if(m>1000){
            throw new MyException("方法的参数超过了1000");
        }
    }

}
