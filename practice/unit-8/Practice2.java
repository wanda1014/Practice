package cn.wanda.chapter8;

public class Practice2 {

    public static void main(String[] args) {

        Character char1 = new Character('Q');
        Character char2 = new Character('q');
        System.out.println(char1.equals(char2));
        Character char3 = Character.toLowerCase(char1);
        Character char4 = Character.toLowerCase(char2);
        System.out.println(char3.equals(char4));

    }

}
