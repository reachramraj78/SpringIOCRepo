package com.vidvaan.network.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NetworkTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Network network = (Network) context.getBean("network");
		network.calls();
		network.data();
		network.sms();
	}

}
