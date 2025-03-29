package in.sp.resources;
import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddressObject()
	{
		Address address=new Address();
		address.setHouse_number(211);
		address.setCity("Pune");
		address.setPin_code(876211);
		return address;
	}
	@Bean
	public Address createAddressObject1()
	{
		Address address=new Address();
		address.setHouse_number(456);
		address.setCity("Delhi");
		address.setPin_code(121212);
		return address;
	}
	@Bean
	public Student createStudentClass()
	{
		Student student=new Student();
		student.setName("Tanzeem");
		student.setRoll_number(21);
//		student.setAddress(createAddressObject());
		return student;
	}
}
