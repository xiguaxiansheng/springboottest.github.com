package com.springboot.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.Student;
import com.springboot.test.service.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentDataController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentDataController.class);

	//不用实例化，自动装配
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getStudents(){
		logger.info("从web数据库student表读取学生数据集合....");
		return studentService.getList();
	}
	
}
