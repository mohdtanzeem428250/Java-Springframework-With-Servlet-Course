package in.sp.beans;
public class Student 
{
	private String name;
	private int roll_number;
	private Address address;
	public void setName(String name) {
		System.out.println("Setter Method Name");
		this.name = name;
	}
	public void setRoll_number(int roll_number) {
		System.out.println("Setter Method Roll Number");
		this.roll_number = roll_number;
	}
	public void setAddress(Address address) {
		System.out.println("Setter Method Address");
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+roll_number);
		System.out.println("Address : "+address);
	}
}
