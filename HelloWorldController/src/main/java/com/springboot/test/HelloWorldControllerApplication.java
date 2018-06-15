package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.springboot.test.servlet.MyServlet;

@SpringBootApplication
@ServletComponentScan
public class HelloWorldControllerApplication {

	/*
	 * 注册Servlet
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new MyServlet(),"/xs/*");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldControllerApplication.class, args);
	}
}
