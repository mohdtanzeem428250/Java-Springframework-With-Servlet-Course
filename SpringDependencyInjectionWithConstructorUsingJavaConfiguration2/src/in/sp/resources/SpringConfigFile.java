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
		Address address=new Address(546,"Punjab",341237);
		return address;
	}
	@Bean
	public Student createStudentClass()
	{
		Student student=new Student("Rahul",786,createAddressObject());
		return student;
	}
}
