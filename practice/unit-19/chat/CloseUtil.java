package cn.wanda.chapter19.chat;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭流的工具类
 * @author wanda
 *
 */

public class CloseUtil {
	
	public static void closeAll(Closeable...io){
		for (Closeable temp : io) {
			try {
				if(null!=temp){
					temp.close();
				}
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
		
	}

}
