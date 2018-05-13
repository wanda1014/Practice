package cn.wanda.chapter19.chat;

/**
 * 客户端，运行多次，产生多个客户端，模拟多人聊天
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//客户端启动时，提示输入客户端的名称，用来模拟多人聊天
		System.out.println("请输入名称：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		if(name.equals("")){
			return;
		}
		
		//创建客户端
		Socket client = new Socket("localhost", 8888);
		//发送数据
		new Thread(new Send(client,name)).start();	//一条路径
		//接收数据
		new Thread(new Receive(client)).start();	//一条路径
		
	}

}
