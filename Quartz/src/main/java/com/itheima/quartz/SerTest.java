package com.itheima.quartz;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SerTest {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void test01(){
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
