package com.org.dao.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;

public class UserDao {
	private static BufferedReader buffer;
	/**
	 * 
	 * @param context
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean saveUserInfo(Context context,String username,String password){
		try {
			//String filePath="/data/data/com.org.seeme/log.txt";
			File file=new File(context.getFilesDir(),"info.txt");
			FileOutputStream  out=new FileOutputStream(file);
			out.write((username+"#"+password).getBytes());
			out.close();	
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 获取本地的用户名和密码
	 * @param context
	 * @return
	 */
	public static Map<String,String> getSaveInfo(Context context){
		try {
			File file =new File(context.getFilesDir(),"info.txt");
			FileInputStream in=new FileInputStream(file);
			buffer = new BufferedReader(new InputStreamReader(in));
			String text=buffer.readLine();
			String infos[]=text.split("#");
			Map<String, String> map=new HashMap<String, String>();
			map.put("username", infos[0]);
			map.put("password", infos[1]);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
