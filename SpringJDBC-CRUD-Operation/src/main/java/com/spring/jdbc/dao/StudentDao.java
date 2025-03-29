package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student1;

public interface StudentDao 
{
	abstract public int insert(Student1 student);
	abstract public int update(Student1 student);
	abstract public int delete(int studentId);
	public Student1 getSelect(int studentId);
	public List<Student1> getAllRowTable();
}
