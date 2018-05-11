package cn.wanda.chapter6;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,3,5,7,9};
        int[] arr2 = Arrays.copyOf(arr1,3);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("---------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

}
