package javapracticeme;

public class Customer { // State+ Behaviour

	private String id; // fields/data/state/ properties
	private String firstName;
	private String lastName;
	private char gender;
	private int age;
	private String address;
	private String mobileno;
	
	
	
	
	public Customer() { // No-args/no-params constructor
	}

	public Customer(String id, String firstName, char gender) { // parameterized constructor

		this.id = id;
		this.firstName = firstName;
		this.gender = gender;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	
	
	
	// actions/Behaviours/methods/
	 String walk() {

		return "Walking....";
	}

	void buy() {

		System.out.println("Buying....");

	}

	boolean login() {

		return true;

	}

	void sleep() {
		System.out.println("Sleeping....");
	}

	String register() {
		return "345858588";
	}

}
