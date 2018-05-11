package cn.wanda.chapter6;

import java.util.Arrays;

public class Practice3 {

    public static void main(String[] args) {

        String[] arr = new String[]{"a","b","c","d","e"};
        for (String str:arr) {
            System.out.print(str+"\t");
        }
        System.out.println();
        Arrays.fill(arr,2,3,"bb");
        for (String str:arr) {
            System.out.print(str+"\t");
        }

    }

}
