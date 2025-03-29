package in.sp.beans;
import java.util.HashMap;
public class Subject 
{
	private HashMap<String,Integer> subjects;
	
	public HashMap<String,Integer> getSubject()
	{
		return subjects;
	}
	public void setSubject(HashMap<String,Integer> subject)
	{
		this.subjects=subject;
	}
	@Override
	public String toString()
	{
		return subjects.toString();
	}
}
