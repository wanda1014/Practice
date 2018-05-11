package cn.wanda.chapter4;

public class Practice3 {

    public static void main(String[] args) {

        double sum = 0;
        double x = 1;
        int i = 1;
        while (i < 20){
            sum = sum + x;
            i++;
            x = x * (1.0/i);
        }
        System.out.println(sum);

    }

}
