package com.springboot.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping
	 public String hello() {
		 return "Hello World...";
	 }
	
	@RequestMapping("/info")
	public Map<String,String> getInto(@RequestParam String name){
		Map<String,String> map = new HashMap<>();
		map.put("name", name);
		return map;
	}
	
	@RequestMapping("/list")
	public List<Map<String,String>> getList(){
		List<Map<String,String>> list = new ArrayList<>();
		Map<String,String> map = null;
		
		for(int i=1;i<5;i++) {
			map = new HashMap<>();
			map.put("name", "hello-"+i);
			list.add(map);
		}
		return list;
	}
	
	@RequestMapping("/log")
	public String log() {
		logger.debug("DeBug日志记录....");
		logger.info("Info日志记录....");
		logger.error("Error日志记录....");
		return "hello log...";
	}

}















