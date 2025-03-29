package in.sp.mapper;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import in.sp.beans.Student;
public class StudentRowMapper implements RowMapper<Student>
{
	@Override
	public Student mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		Student student=new Student();
		student.setRoll_number(rs.getInt("Roll_Number"));
		student.setName(rs.getString("Name"));
		student.setMarks(rs.getFloat("Marks"));
		return student;
	}
}