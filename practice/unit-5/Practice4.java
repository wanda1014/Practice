package cn.wanda.chapter5;

public class Practice4 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("abc");
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

    }

}
