package com.springboot.test.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	/*
	 * 从application.properties配置文件中找值
	 * 找不到则赋值hello world
	 */
	@Value("${application.hello:hello world}")
	private String hello = "hello world";
	
	
	/*
	 *直接返回字符串，框架会去spring.view.prefix目录下
	 *（index与spring.view.suffix拼接起来）的页面
	 *
	 */
	@RequestMapping(value = {"/","/index"})
	public String index(Map<String,Object> model) {
		
		model.put("time", new Date());
		model.put("message", this.hello);
		return "index";
	}
	
	@RequestMapping("/page1")
	public ModelAndView page1() {
		
		ModelAndView mav = new ModelAndView("page/page1");
		mav.addObject("content",hello);
		return mav;
	}
	
	
	@RequestMapping("/page2")
	public String page2(Model model) {
		model.addAttribute("content",hello+"....");
		return "page/page1";
	}
	
	
	
	
	
	
	
	
	
	
	

}
