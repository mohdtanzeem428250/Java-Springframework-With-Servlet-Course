package in.sp.beans;

public class Address 
{
	private int house_number;
	private String city;
	private int pin_code;
	
	public Address(int house_number, String city, int pin_code)
	{
		this.house_number=house_number;
		this.city=city;
		this.pin_code=pin_code;
	}
	@Override
	public String toString() {
		return "#"+house_number+", "+city+", "+pin_code;
	}
	
	
}
