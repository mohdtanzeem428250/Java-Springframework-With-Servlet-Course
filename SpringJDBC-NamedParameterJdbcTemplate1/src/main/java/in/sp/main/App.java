package in.sp.main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import in.sp.resources.SpringConfigFile;
import in.sp.mapper.*;
import java.util.List;
import in.sp.beans.Student;
public class App 
{
    public static void main( String[] args )
    {
//    	int Roll_Number=103;
//    	String Name="Rahul";
//    	float Marks=88.4f;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
      
        //--------------------Insert Operation------------------------
        
//        String insert_sql_query="insert into student values(?,?,?)";
//        int count=jdbcTemplate.update(insert_sql_query,Roll_Number,Name,Marks);
//        if(count>0)
//        {
//        	System.out.println("Inserted Success");
//        }
//        else
//        {
//        	System.out.println("Inserted Failed");
//        }
        
        //--------------------Update Operation-----------------------
        
//        int Roll_Number=102;
//        float Marks=78.5f;
//        String update_sql_query="update student set Marks=? where Roll_Number=?";
//        int count=jdbcTemplate.update(update_sql_query,Marks,Roll_Number);
//        if(count>0)
//          {
//          	System.out.println("Update Success");
//          }
//          else
//          {
//          	System.out.println("Update Failed");
//          }
        
        //-----------------------Delete Operation----------------------
        
//        int Roll_Number=102;
//        String delete_sql_query="delete from student where Roll_Number=?";
//        int count=jdbcTemplate.update(delete_sql_query,Roll_Number);
//      if(count>0)
//      {
//      	System.out.println("Delete Success");
//      }
//      else
//      {
//      	System.out.println("Delete Failed");
//      }

        //-----------------------Select Operation 1-----------------------
//        
//        String select_sql_query="select *from student";
//        List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//        for(Student std : std_list)
//        {
//        	System.out.println("Roll Number : "+std.getRoll_number());
//        	System.out.println("Name : "+std.getName());
//        	System.out.println("Marks : "+std.getMarks());
//        	System.out.println("-----------------------------------");
//        }
        
        //-----------------------Select Operation 2-------------------
        
//         int roll=101;
//        String select_sql_query="select *from student where Roll_Number=?";
//        List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper(),roll);
//        for(Student std : std_list)
//        {
//        	System.out.println("Roll Number : "+std.getRoll_number());
//        	System.out.println("Name : "+std.getName());
//        	System.out.println("Marks : "+std.getMarks());
//        	System.out.println("-----------------------------------");
//        }
        
        //--------------------Select Operation 3----------------------
        
        int roll=102;
        String select_sql_query="select *from student where Roll_Number=?";
        Student std =jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(),roll);
     	System.out.println("Roll Number : "+std.getRoll_number());
     	System.out.println("Name : "+std.getName());
     	System.out.println("Marks : "+std.getMarks());
     	System.out.println("-----------------------------------");
    }
}
