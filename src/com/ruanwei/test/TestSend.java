package com.ruanwei.test;
import org.junit.Test;

import com.ruanwei.interfacej.SmsClientSend;


public class TestSend {

	@Test
	public void testSend(){
		String url = "http://www.duanxin10086.com/sms.aspx";
		String userid = "11422";
		String account = "cn1279";
		String password = "ww9999";
		String mobile = "18942560376";
		String content = "你好";
		String returnString = SmsClientSend.sendSms(url, userid, account, password, mobile, content);
		System.out.println(returnString);
	}
}
