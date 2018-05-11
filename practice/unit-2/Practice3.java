package cn.wanda.chapter3;

public class Practice3 {

    public static void main(String[] args) {

        byte myByte = 126;
        byte myByte2 = (byte) 129;
        short myShort = 32766;
        long myLong = 1111111111;
        int myInt1 = myByte;
        int myInt2 = myShort;
        int myInt3 = (int) myLong;
        System.out.println(myInt1);
        System.out.println(myByte2);
        System.out.println(myInt2);
        System.out.println(myInt3);


    }

}
