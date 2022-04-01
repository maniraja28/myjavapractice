package javapracticeme;

public class F1_Prime {
	public static void main(String[] args) {
		int n = 12;
		boolean check = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				System.out.println(n + " is not a prime number");
				check = false;
				break;

			}
		}
		 if(check) {
			System.out.println(n + " is a prime number");
		}
	}

}
//prime number is defined with a given number is divesible with one and it self that number we are called has a prime number