package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.resources.*;
import in.sp.beans.Studnt;
public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(SpingConigFile.class);
		Studnt student=context.getBean(Studnt.class);
		student.display();
		
	}
	
}
