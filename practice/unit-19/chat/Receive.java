package cn.wanda.chapter19.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 接收数据
 * @author wanda
 *
 */

public class Receive implements Runnable{
	//管道输入流
	private DataInputStream dis;
	//控制线程
	private Boolean isRunning = true;
	public Receive() {
	}
	public Receive(Socket client){
		this();
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
//			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
	}
	
	//接收数据
	public String receive(){
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
//			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
		
		return msg;
	}
	@Override
	public void run() {
		while(isRunning){
			System.out.println(receive());
		}
	}

}
