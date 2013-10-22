package com.org.domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String userName="liangjilong";
		String passWord="admin1988";
		try {
			URL url = new URL("http://localhost:8081//Sesame/UserAction");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			conn.connect();
			PrintWriter out = new PrintWriter(conn.getOutputStream());
			String params="userName="+userName + "&passWord=" + passWord;
			out.println(params);
			out.flush();
			out.close();
			conn.disconnect();
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"GBK"));
			String str = buffReader.readLine();
			if (str.trim().equals("success")) {
				System.out.println("success");
			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
