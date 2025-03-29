package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Studnt 
{
	private String name;
	private int age;
	@Autowired					//automatically dependency injection
	private Address address;
	@Autowired
	private Subject subjects;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	public Subject getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Subject subjects) {
//		this.subjects = subjects;
//	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Adress : "+address);
		System.out.println("Subject : "+subjects);
	}
}
