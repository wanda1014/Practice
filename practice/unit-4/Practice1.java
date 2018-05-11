package cn.wanda.chapter4;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        if (x % 2 == 0){
            System.out.println(x + "为偶数");
        }else {
            System.out.println(x + "为奇数");
        }

    }

}
