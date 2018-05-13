package cn.wanda.chapter19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 编写TCP服务器程序，实现创建一个在8001端口上等待的ServerSocket对象，当接收到一个客户机的连接请求后，
 * 程序从与客户机建立了连接的Socket对象中获得输入/输出流。通过输出流向客户机发送信息
 */

public class Practice2 {

    public static void main(String[] args) throws IOException {

        //创建服务器端
        ServerSocket serverSocket = new ServerSocket(8001);

        //等待客户端连接
        Socket client = serverSocket.accept();

        //服务端输入输出流
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        //输入流
        while (true){
            String msg = dis.readUTF();
            //输出流
            System.out.println("接收到客户端发来的信息：" + msg);
            dos.writeUTF("服务器-->" + msg);
            dos.flush();
        }

    }

}
