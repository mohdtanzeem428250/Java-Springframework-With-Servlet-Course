package in.sp.resources;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Subject;
import org.springframework.context.annotation.Bean;
import in.sp.beans.Studnt;
import in.sp.beans.Address;
import java.util.HashMap;
import java.util.ArrayList;
@Configuration
public class SpingConigFile 
{
	@Bean
	public Studnt createObjectStudent()
	{
		Studnt student=new Studnt();
		student.setName("Tanzeem");
		student.setAge(21);
//		student.setAddress(createObjectAddress()); //manually dependency injection
//		student.setSubjects(createObjectSubject());
		return student;
	}
	@Bean
	public Address createObjectAddress()
	{
		Address address=new Address();
		address.setHouse_number(432);
		address.setCity("Kerala");
		address.setPin_code(123321);
		return address;
	}
	@Bean
	public Subject createObjectSubject()
	{
		Subject subject=new Subject();
		HashMap<String,Integer> string_list=new HashMap<String,Integer>();
		string_list.put("JAVA",87);
		string_list.put("PYTHON",67);
		string_list.put("C++",98);
		subject.setSubject(string_list);
		return subject;
	}
}
