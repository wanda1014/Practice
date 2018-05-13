package cn.wanda.chapter19.chat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 发送数据
 * @author wanda
 *
 */

public class Send implements Runnable {
	
	//控制台输入流
	private BufferedReader console;
	//管道输出流
	private DataOutputStream dos;
	//控制线程
	private Boolean isRunning = true;
	//名称
	private String name;
	public Send() {
		//从控制台输入信息
		console = new BufferedReader(new InputStreamReader(System.in));
	}
	//构造方法
	public Send(Socket client,String name){
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
			this.name = name;
			send(this.name);
		} catch (IOException e) {
//			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dos,console);
		}
	}
	
	//1、从控制台接收数据
	private String getMsgFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return "";
	}
	
	//2、发送数据
	public void send(String msg){
		try {
			if(msg!=null && !msg.equals("")){
				dos.writeUTF(msg);
				dos.flush();	//强制刷新
			} 
		}catch (IOException e) {
//			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dos,console);
		}
	}
	
	@Override
	public void run() {
		//线程体
		while(isRunning){
			send(getMsgFromConsole());
		}
	}
	
	

}
