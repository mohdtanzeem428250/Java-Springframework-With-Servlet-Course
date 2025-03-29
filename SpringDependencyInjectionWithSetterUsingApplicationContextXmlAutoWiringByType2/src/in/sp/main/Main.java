package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
public class Main 
{
	public static void main(String[] args)
	{
		String file="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(file);
		Student student=(Student)context.getBean("studentId");
		student.display();
	}
}
