package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring.xml");
		MiTv tv=ctx.getBean("mitv",MiTv.class);
		MiTv tv2=ctx.getBean("mitv2",MiTv.class);
		System.out.println("tv:"+tv);
		System.out.println("tv2:"+tv2);
		
		tv.volumeUp();
		tv2.volumeUp();
	}
}

