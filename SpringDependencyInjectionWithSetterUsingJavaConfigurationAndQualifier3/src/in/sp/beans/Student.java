package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student 
{
	private String name;
	private int roll_number;
	@Autowired
	@Qualifier("createAddressObject")
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll_number);
		System.out.println("Address : "+address);
	}
}
