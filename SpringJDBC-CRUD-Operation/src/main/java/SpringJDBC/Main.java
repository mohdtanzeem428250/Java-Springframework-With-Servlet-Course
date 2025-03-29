package SpringJDBC;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImplements;
import com.spring.jdbc.entities.Student1;
public class Main 
{
	public static void main(String[] args)
	{
		String file_path="SpringJDBC/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(file_path);
		StudentDaoImplements studentDaoImplements=context.getBean("dao",StudentDaoImplements.class);
		Student1 student=new Student1();
		student.setStudentId(100);
		student.setStudentName("Mahak");
		student.setStudentAddress("Punjab");
//		
		
//		System.out.println("Please Enter Value And Delete Row");
//		Scanner scanner=new Scanner(System.in);
//		int id=scanner.nextInt();
		int result=studentDaoImplements.insert(student);
		if(result>0)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
//		Student1 student1=studentDaoImplements.getSelect(14);
//		System.out.println(student1);
//		List<Student1> student2=studentDaoImplements.getAllRowTable();
//		for(Student1 s:student2)
//		{
//			System.out.println(s);
//		}
	}
}
