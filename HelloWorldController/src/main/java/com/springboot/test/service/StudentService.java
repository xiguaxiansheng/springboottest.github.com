package com.springboot.test.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.springboot.test.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> getList(){
		String sql = "SELECT ID,NAME,AGE FROM STUDENT";
		return (List<Student>)jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setId(rs.getInt("id"));
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				return stu;
			}
			
		});
	}

}
