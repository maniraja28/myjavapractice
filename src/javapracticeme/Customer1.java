package javapracticeme;

public class Customer1 {
	
	private String id;
	private String firstName;//state
	private String lastname;
	char gender;
	private String age;
	private String mobilenumber;
	private String adress;
	public Customer1(String id, String firstName, String lastname, char gender, String age, String mobilenumber,
			String adress) {//behaviour
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
		this.mobilenumber = mobilenumber;
		this.adress = adress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
}
	