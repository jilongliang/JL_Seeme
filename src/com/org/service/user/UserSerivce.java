package com.org.service.user;

import java.util.Map;

import android.content.Context;

import com.org.dao.user.UserDao;

@SuppressWarnings("all")
public class UserSerivce {
	/**
	 * 登录保存日志信息
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean saveUserInfo(Context context,String username,String password){
		return new UserDao().saveUserInfo(context, username, password);
	}
	/**
	 * 
	 * @param context
	 * @return
	 */
	public static Map<String,String> getSaveInfo(Context context)
	{
		return new UserDao().getSaveInfo(context);
	}
}
