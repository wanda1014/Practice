package cn.wanda.chapter5;

public class Practice3 {

    public static void main(String[] args) {

        String regex = "1[3578]\\d{9}";
        String text = "19871107008";
        if(text.matches(regex)){
            System.out.println(text + "是合法的手机号");
        }else {
            System.out.println(text + "不是合法的手机号");
        }

    }

}
