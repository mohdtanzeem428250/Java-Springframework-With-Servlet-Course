package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.spring.jdbc.entities.Student1;
public class RowMapperImplements implements RowMapper<Student1> 
{

	@Override
	public Student1 mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student1 student=new Student1();
		student.setStudentId(rs.getInt(1));
		student.setStudentName(rs.getString(2));
		student.setStudentAddress(rs.getString(3));
		return student;
	}

}
