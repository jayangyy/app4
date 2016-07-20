package cn.luxh.app.test;

import org.junit.Test;

import cn.luxh.app.util.MD5Util;

public class MD5Tester {
	
	@Test
	public void testEncodePassword() {
		String password = "123456";
		String salt = "luxh";
		System.out.println(MD5Util.encodePassword(password, salt));
	}
}
