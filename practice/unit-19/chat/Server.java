package cn.wanda.chapter19.chat;

/**
 * 服务端：实现了系统消息，所有人聊天消息，私聊消息的不同效果
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	private List<MyChannel> all = new ArrayList<MyChannel>();

	public static void main(String[] args) throws IOException {
		
		new Server().start();
		
	}
	
	public void start() throws IOException{
		//创建服务器
		ServerSocket serverSocket = new ServerSocket(8888);
		while(true){
			//等待客户端连接
			Socket client = serverSocket.accept();
			
			MyChannel myChannel = new MyChannel(client);
			all.add(myChannel);	//统一管理
			new Thread(myChannel).start();	//一条道路
		}
	}
	
	//一个客户端一条道路
	private class MyChannel implements Runnable{
		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;
		private String name;
		public MyChannel(Socket client) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
				
				this.name = dis.readUTF();
				System.out.println(name);
				
				this.send("欢迎您进入聊天室");
				sendOthers(this.name + "进入了聊天室",true);
				
			} catch (IOException e) {
//				e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dis,dos);
			}
		}
		
		//接收数据
		private String receive(){
			String msg = "";
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
//				e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dis);
				all.remove(this);	//移除自身
			}
			return msg;
		}
		
		//发送数据
		private void send(String msg){
			if(msg == null || msg.equals("")){
				return;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
//				e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dos);
				all.remove(this);	//移除自身
			}
		}
		
		//发送数据给其他客户端
		private void sendOthers(String msg,boolean sys){
			//判断是否为私聊
			if(msg.startsWith("@")&&msg.indexOf("：")>-1){
				//获取name
				String name = msg.substring(1, msg.indexOf("："));
				String content = msg.substring(msg.indexOf("：")+1);
				for (MyChannel other : all) {
					if(other.name.equals(name)){
						other.send(this.name + "对您悄悄的说：" + content);
					}
				}
				
			}else{
			
				//遍历容器
				for (MyChannel other : all) {
					if(other == this){
						continue;
					}
					if(sys == true){	//系统信息
						other.send("系统信息：" + msg);
					}else{
						//发送给其他客户端
						other.send(this.name + "对所有人说：" + msg);
					}
				}
			}
		}

		@Override
		public void run() {
			while(isRunning){
				sendOthers(receive(),false);
			}
		}
		
		
	}


}
