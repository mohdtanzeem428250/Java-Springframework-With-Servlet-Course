package in.sp.beans;

public class Address 
{
	private int house_number;
	private String city;
	private int pin_code;
	public void setHouse_number(int house_number) {
		System.out.println("Setter Method House Number");
		this.house_number = house_number;
	}
	public void setCity(String city) {
		System.out.println("Setter Method City");
		this.city = city;
	}
	public void setPin_code(int pin_code) {
		System.out.println("Setter Method Pin Code");
		this.pin_code = pin_code;
	}
	@Override
	public String toString() {
		return "#"+house_number+", "+city+", "+pin_code;
	}
	
	
}
