package in.sp.resources;
import in.sp.beans.Student;
import in.sp.beans.Address;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student createObjectStudent()
	{
		Student student=new Student("Tahseen",212,createObjectAddress());
		return student;
	}
	@Bean
	public Address createObjectAddress()
	{
		Address address=new Address(234,"Bareilly",123493);
		return address;
	}
}
