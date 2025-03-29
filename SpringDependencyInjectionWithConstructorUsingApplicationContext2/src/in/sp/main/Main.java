package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;
public class Main 
{
	public static void main(String[] args)
	{
		String file_path="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(file_path);
		Student object=(Student)context.getBean("studentId");
		object.display();
	}
}
