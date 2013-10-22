package com.org.action.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.org.MainActivity;
import com.org.R;

@SuppressWarnings("all")
public class LoginActivity extends Activity {
	private String tag = "LoginActivity";
	private EditText et_userName;
	private EditText et_passWord;
	private CheckBox is_flag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);// ����
		et_userName = (EditText) this.findViewById(R.id.et_userName);
		et_passWord = (EditText) this.findViewById(R.id.et_passWord);
		is_flag = (CheckBox) findViewById(R.id.ck_remember_Pwd);
		/**
		 * ��Ȿ���Ƿ����û���������
		 */
		/*Map<String, String> map = new UserDao().getSaveInfo(this);

		if (map != null) {
			et_userName.setText(map.get("username"));
			et_passWord.setText(map.get("password"));
		}*/
	}

	/**
	 * ��¼
	 */
	public void loginClick(View v1) {
		String userName = et_userName.getText().toString().trim();
		String passWord = et_passWord.getText().toString().trim();
		System.out.println("userName="+userName+"=passWord="+passWord);
		if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(passWord)) {
			// ��ʾ
			Toast.makeText(this, "�û��������벻��Ϊ��", Toast.LENGTH_SHORT).show();
			Log.i(tag, "��֤����ǿ�ֵ~");
			return;
		}
		if (is_flag.isChecked()) {
			// �����û�������
			try {
				URL url = new URL("http://localhost:8080//Sesame/UserAction");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoInput(true);
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.addRequestProperty("Content-Type","application/x-www-form-urlencoded");
				conn.connect();
				PrintWriter out = new PrintWriter(conn.getOutputStream());
				String params="userName="+userName + "&passWord=" + passWord;
				System.out.println("params="+params);
				out.println(params);
				
				//conn.disconnect();
				BufferedReader buffReader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"GBK"));
				String str = buffReader.readLine();
				if (str.trim().equals("success")) {
					Toast.makeText(this, "��¼�ɹ�", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(LoginActivity.this,MainActivity.class);
					startActivity(intent);
				} else {
					Toast.makeText(this, "�û������������!", Toast.LENGTH_SHORT).show();
				}
				out.flush();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
 				System.out.println("getMessage="+e.getMessage());
			}
		}
	}
	public void back(View v) {
		finish();
	}
}
