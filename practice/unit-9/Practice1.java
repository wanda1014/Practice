package cn.wanda.chapter9;

/**
 * 获取2-32(不包括32)之间的6个偶数，并取得这6个偶数的和
 */

public class Practice1 {

    public static int Sum(int a, int b){
        int sum = 0;
        int count = 0;
        while (true){
            int temp = (int)a + (int)(Math.random() * (b - a));
            if(temp != 0 && temp % 2 ==0){
                System.out.print(temp+"\t");
                sum += temp;
                count++;
            }
            if(count == 6){
                break;
            }
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(Sum(2,32));

    }

}
