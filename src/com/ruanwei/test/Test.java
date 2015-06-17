package com.ruanwei.test;

import com.ruanwei.interfacej.SmsClientKeyword;
import com.ruanwei.interfacej.SmsClientOverage;
import com.ruanwei.tool.SmsClientAccessTool;

public class Test {

	public static String url = "http://118.145.18.144:7777/sms.aspx";
	public static String userid = "11422";
	public static String account = "cn1279";
	public static String password = "ww9999";
	public static String checkWord = "测试测试";

	public static void main(String[] args) {

		keyword();
		// overage();
	}

	public static void keyword() {

		String keyword = SmsClientKeyword.queryKeyWord(url, userid, account,
				password, checkWord);
		System.out.println(keyword);
	}

	public static void overage() {

		String overage = SmsClientOverage.queryOverage(url, userid, account,
				password);
		System.out.println(overage);
	}

	public static void test() {
		String send = SmsClientAccessTool.getInstance().doAccessHTTPPost(
				"http://118.145.30.35/sms.aspx", "", "utf-8");
		System.out.println(send);
	}
}
