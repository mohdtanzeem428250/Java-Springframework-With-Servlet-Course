package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entities.Student1;
import org.springframework.jdbc.core.RowMapper;
public class StudentDaoImplements implements StudentDao
{
	private JdbcTemplate jdbcTemplate;
	@Override
	public int insert(Student1 student) 
	{
		String query="insert into student values(?,?,?)";
		int result=this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentAddress());
		
		return result;
	}
	@Override
	public int update(Student1 student)
	{
		String query="update student set Student_Name=?, Student_Address=? where Student_Id=?";
		int result=this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentAddress(),student.getStudentId());
		return result;
	}
	@Override
	public int delete(int studentId)
	{
		String query="delete from student where Student_Id=?";
		int result=this.jdbcTemplate.update(query,studentId);
		return result;
	}
	@Override
	public Student1 getSelect(int studentId)
	{
		String query="select *from student where Student_Id=?";
		RowMapper<Student1> rowMapper=new RowMapperImplements();
		Student1 student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return student;
	}
	@Override
	public List<Student1> getAllRowTable()
	{
		String query="select *from student";
		List<Student1> student=this.jdbcTemplate.query(query,new RowMapperImplements());
		return student;
	}
	public JdbcTemplate getJdbcTemplate() 
	{
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
