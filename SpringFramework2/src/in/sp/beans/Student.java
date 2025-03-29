package in.sp.beans;
public class Student 
{
	private String name;
	private int age;
	private String email;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Email : "+email);
	}
}
