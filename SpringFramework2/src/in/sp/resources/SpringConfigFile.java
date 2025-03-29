package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Student;
@Configuration
public class SpringConfigFile 
{
	@Bean("studentObject1")
	public Student createStudentBeanObject1()
	{
		Student object1=new Student();
		object1.setName("Tanzeem");
		object1.setAge(12);
		object1.setEmail("Tanzeem@gmail.com");
		return object1;
	}
	@Bean("studentObject2")
	public Student createStudentBeanObject2()
	{
		Student object1=new Student();
		object1.setName("Pervez");
		object1.setAge(21);
		object1.setEmail("Pervez@gmail.com");
		return object1;
	}
	@Bean("studentObject3")
	public Student createStudentBeanObject3()
	{
		Student object1=new Student();
		object1.setName("Rahul");
		object1.setAge(24);
		object1.setEmail("Rahul@gmail.com");
		return object1;
	}
}
