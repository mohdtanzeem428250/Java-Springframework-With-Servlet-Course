package in.sp.main;
import in.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.Student;
public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);

//		Student object=(Student)context.getBean("student1");
//		object.display();
		
//		Student object=context.getBean(Student.class);
//		object.display();
		
//		Student object=(Student)context.getBean("studentObject");
//		object.display();
		
		Student object1=(Student)context.getBean("studentObject1");
		object1.display();
		System.out.println("------------------------------------");
		Student object2=(Student)context.getBean("studentObject2");
		object2.display();
		System.out.println("------------------------------------");
		Student object3=(Student)context.getBean("studentObject3");
		object3.display();
		
	}
}
