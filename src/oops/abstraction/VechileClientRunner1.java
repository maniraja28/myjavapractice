package oops.abstraction;

public class VechileClientRunner1 {
	public static void main(String[] args) {
	Car c = new Car();
	c.setColor("white");
	c.setModel("123");
	c.setNumber("9879");
	System.out.println("car...." + c);
	Bus b = new Bus ();
	b.setColor("red");
	b.setModel("444");
	b.setNumber("777");
	System.out.println("bus..."   + b);
	}
	

}
