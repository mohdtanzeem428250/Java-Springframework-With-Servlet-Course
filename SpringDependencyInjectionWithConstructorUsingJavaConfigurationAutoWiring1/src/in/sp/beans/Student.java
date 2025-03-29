package in.sp.beans;
public class Student 
{
	private String name;
	private int roll_number;
	private Address address;
	
	public Student(String name, int roll_number, Address address)
	{
		this.name=name;
		this.roll_number=roll_number;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll_number);
		System.out.println("Address : "+address);
	}
}
 