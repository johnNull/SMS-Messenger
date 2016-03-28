public class Person {
	String name;
	String lName;
	String Carrier;
	String phoneNumber;
	
	public Person(){
		
	}

	public Person(String inName, String inLName,String Carrier,String inNum) {
		name = inName;
		lName = inLName;
		this.Carrier = Carrier;
		phoneNumber = inNum;
	}

	public void setName(String newName) {
		name = newName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setNumber(String newNum) {
		phoneNumber = newNum;
	}
	
	public void setCarrier(String Carrier){
		this.Carrier = Carrier;
	}

	public String getNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public String getlName(){
	return lName;
	}
	
	public String getCarrier(){
		return Carrier;
	}
}
