package com.springboot.test.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(value = 2) //value表示优先级顺序，越小越早执行
public class MyStartupRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(">>>>>>>>>服务器启动，开始加载用户数据...<<<<<<<");
		
	}

}
