package cn.wanda.chapter5;

public class Practice2 {

    public static void main(String[] args) {

        String str1 = "Hello World!";
        String str2 = "I love world";

        String newstr1 = str1.substring(8,11);
        String newstr2 = str2.substring(9,12);
        System.out.println(newstr1);
        System.out.println(newstr2);

        if(newstr1.equalsIgnoreCase(newstr2)){
            System.out.println("两个子串相同");
        }else{
            System.out.println("两个子串并不相同");
        }

    }

}
