package cn.wanda.chapter19;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获得指定端口的主机名、主机地址和本机地址
 */

public class Practice1 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("主机名：" + ip.getHostName());
            System.out.println("主机地址：" + ip.getHostAddress());
            System.out.println("本机地址：" + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
