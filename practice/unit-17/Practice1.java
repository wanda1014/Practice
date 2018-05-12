package cn.wanda.chapter17;

import java.io.*;
import java.util.Scanner;

/**
 * 从键盘输入文件的内容和要保存的文件名称
 * 之后根据输入的名称创建文件，并将内容保存到文件之中
 * (本文实现连续写入内容，输入exit退出)
 */

public class Practice1 {

    public static void main(String[] args) throws IOException {

        //与键盘交互，得到第一个字符串，最好是带后缀的字符串如“wanda.txt”
        Scanner sr = new Scanner(System.in);
        String str1 = sr.nextLine();
//        File file = new File("C:\\Users\\wanda\\Desktop\\str");
        //根据路径，创建一个以str如（wanda.txt）命名的文件，并且得到文件的写入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\wanda\\Desktop\\" + str1));

        //得到键盘输入字符串的输入流，然后用文件输入修饰BufferedReader进行修饰
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br.readLine();

        //用while循环实现重复向文件中写入内容，遇到exit退出程序
        while (!str2.equals("exit")){
            //将字符串str2写入文件中
            bw.write(str2);
            //换行
            bw.newLine();
            bw.flush();
            //重复从键盘输入字符串
            str2 = br.readLine();
        }
        //关闭流
        br.close();
        bw.close();

    }

}
