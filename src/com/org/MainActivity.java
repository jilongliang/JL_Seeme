package com.org;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.org.action.user.LoginActivity;
@SuppressLint("NewApi")
@SuppressWarnings("all")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
//		if (android.os.Build.VERSION.SDK_INT > 9) {
//		    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//		    StrictMode.setThreadPolicy(policy);
//		}
	}
	Handler handler = new Handler(){
	    @Override
	    public void handleMessage(Message msg) {
	        super.handleMessage(msg);
	        Bundle data = msg.getData();
	        String val = data.getString("value");
	        Log.i("mylog","请求结果-->" + val);
	    }
	};
	Runnable runnable = new Runnable(){
	    @Override
	    public void run() {
	        // http request.
	        Message msg = new Message();
	        Bundle data = new Bundle();
	        data.putString("value","请求结果");
	        msg.setData(data);
	        handler.sendMessage(msg);
	    }
	};
	/**
	 * 登录, 不能写private
	 * @param v1
	 */
	public void startLoginView(View v1){
	   Intent intent=new Intent(this,LoginActivity.class);
	   startActivity(intent);//启动登录界面
	}
}
