package in.sp.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class Student 
{
	@Value("Tanzeem")
	private String name;
	@Value("123")
	private int roll_number;
	@Value("89.2f")
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number : "+roll_number);
		System.out.println("Marks : "+marks);
	}
	
}
