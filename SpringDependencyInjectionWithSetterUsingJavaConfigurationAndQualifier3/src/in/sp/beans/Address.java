package in.sp.beans;
public class Address 
{
	private int house_number;
	private String city;
	private int pin_code;
	public int getHouse_number() {
		return house_number;
	}
	public void setHouse_number(int house_number) {
		this.house_number = house_number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	@Override
	public String toString()
	{
		return "#"+house_number+", "+city+", "+pin_code;
	}
	
}
