package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("HELLO...");
        String location="/in/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(location);
        Student std=(Student)context.getBean("student");
        std.display();
        System.out.println("-------------------------");
        Student std1=(Student)context.getBean("student1");
        std1.display();
        System.out.println("-------------------------");
        Student std3=(Student)context.getBean("student2");
        std3.display();
        
    }
}