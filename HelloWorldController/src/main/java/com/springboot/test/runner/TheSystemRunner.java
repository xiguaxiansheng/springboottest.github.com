package com.springboot.test.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class TheSystemRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println(">>>>>>>>>服务器启动，开始加载系统数据...<<<<<<<");

	}

}
