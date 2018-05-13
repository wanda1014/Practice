package cn.wanda.chapter19;

import java.io.*;
import java.net.Socket;

/**
 * 跟Practice2服务端进行交互的客户端
 */

public class Client {

    public static void main(String[] args) throws IOException {

        //创建客户端
        Socket client = new Socket("localhost",8001);

        //控制台输入流
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        //客户端输入输出流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        while (true){
            String info = console.readLine();
            //输出流
            dos.writeUTF(info);
            dos.flush();
            //输入流
            String msg = dis.readUTF();
            System.out.println(msg);
        }

    }

}
