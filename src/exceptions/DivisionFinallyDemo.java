package exceptions;

public class DivisionFinallyDemo {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 2;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("can't divided by zero");
		} finally {
			System.out.println("This is finally block");
		}
	}
}
