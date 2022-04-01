package javapracticeme;

public class Client {

	public static void main(String[] args) {

		Customer c1 = new Customer(); // Object creation/intialization
		c1.setId("111");
		c1.setAddress("malikipuram");
		c1.setFirstName("raja");
		c1.setMobileno("9849201399");
		c1.setLastName("mani");
//		c1.id = "111";
//		c1.firstName = "John";
//		c1.gender = 'M';
//		c1.age = 30;
//		String res = c1.walk();
//		System.out.println(res);

		Customer c2 = new Customer("4444", "Scott", 'M');
		c2.setAge(30);
		c2.setAddress("nagaram");
//		c2.setGender('m');
//		c2.id = "222";
//		c2.firstName = "Jessy";
//		c2.gender = 'F';
//		c2.buy();

		Customer c3 = new Customer();
		c3.setAddress("Hyderabad");
		c3.setAge(40);
		c3.setFirstName("hari");
//		c3.id = "333";
//		c3.firstName = "Ram";
//		c3.gender = 'M';
//		c3.mobileno= "123445";
//		c3.sleep();

		System.out.println("c1 lastname ->  "+c1.getLastName());
	
		System.out.println("c2 id ->  "+c2.getId());
		System.out.println(c2.getFirstName());
		System.out.println(c2.getGender());
		System.out.println(c2.getAge());
		System.out.println(c2.getMobileno());
		
		System.out.println(c3.getLastName());
	}

}
