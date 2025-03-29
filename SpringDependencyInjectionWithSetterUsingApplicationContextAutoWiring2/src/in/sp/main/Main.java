package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.resources.*;
import in.sp.beans.*;
public class Main 
{
	public static void main(String[] args)
	{
		String file_location="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(file_location);
		Student student=(Student)context.getBean("studentId");
		student.display();
	}
}
