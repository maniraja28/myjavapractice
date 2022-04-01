package exceptions;

public class ThrowsDemo {
	//thows class methods are write another  method is not possible but within the class we have to write the methods
	public static void main(String[] args) {
		System.out.println("main method");
		try {
			m1();
		} catch (Exception e) {
			System.out.println("this is exception");
		}
	}

	public static void m1() {
		System.out.println("this is m1 method");
		m2();
	}

	public static void m2() {
		System.out.println("this is m2 method");
		m3();

	}

	public static void m3() {

		System.out.println(2 / 0);

	}
}