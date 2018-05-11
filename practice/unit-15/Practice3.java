package cn.wanda.chapter15;

import java.io.*;
import java.util.Scanner;

/**
 * 当用户输出姓名和密码时
 * 将每一个姓名和密码加在文件中，如果用户输入done，则结束程序
 */

public class Practice3 {
    static final int lineLength = 100;       //定义一个全局变量，表示每行输入字符的最大长度

    public static void main(String[] args) {
        FileOutputStream fos;               //定义一个输出流，这里不进行初始化
        byte[] name = new byte[lineLength];
        byte[] phoneNum = new byte[lineLength];

        try {
            fos = new FileOutputStream("C:\\Users\\wanda\\Desktop\\test2.txt");
            while (true) {
                System.out.println("请输入名字：");
                Scanner sr = new Scanner(System.in);
                String str = sr.nextLine();
                name = str.getBytes();
                if ("done".equalsIgnoreCase(str)) {
                    System.out.println("录入完成");
                    break;
                }
                for (int j = 0; j < name.length; j++) {
                    fos.write(name[j]);
                }
                fos.write(',');

                System.out.println("请输入电话：");
                Scanner sr2 = new Scanner(System.in);
                String str2 = sr2.nextLine();
                phoneNum = str2.getBytes();
                for (int i = 0; i < phoneNum.length; i++) {
                    fos.write(phoneNum[i]);
                }
                fos.write('\n');

                System.out.println("信息已写入！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
