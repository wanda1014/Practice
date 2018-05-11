package cn.wanda.chapter15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用字符输入、输出流读取文件
 * 将一段文字加密后存入文件，然后再读取，并将加密前和加密后的文件输出
 */

public class Practice2 {

    public static void main(String[] args) {
        try {
            File out = new File("C:\\Users\\wanda\\Desktop\\test.txt"); //获得文件的输出流

            String str = "用来测试加密的文字";
            char[] a = str.toCharArray();       //将文字字符串转换为字符数组
            for (int i = 0; i < a.length; i++) {
                a[i] = (char)(a[i] ^ 'P');      //使用简单的亦或操作来实现加密
            }

            FileWriter fw = new FileWriter(out);    //创建FileWriter对象
            fw.write(a, 0, a.length);           //将测试文字(加密后)写入test.txt文件中
            fw.close();

            FileReader fr = new FileReader(out);    //创建FileReader对象
            char[] b = new char[1024];
            int len = fr.read(b);
            System.out.println("加密后的信息：" + new String(b,0, len));     //打印加密后的信息
            fr.close();

            System.out.println("加密前的信息：" + str);     //打印原文信息

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
