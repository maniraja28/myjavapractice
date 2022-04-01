package javapracticeme;

public class E1_AgeCategoryDemo {
	
	public static void main(String[] args) {
		int age = 1260;
		if (age >= 0 && age <= 12) {
			System.out.println("You are kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are in teen age");
		}  else if (age >= 20 && age <= 30) {
			System.out.println("You are in young age");
		}  if (age >= 31 && age <= 60) {
			System.out.println("You are in middle age");
		} 
		else {
			System.out.println("Youre in old age");

		}
	}
}
//we are using programing purpose if else statement we have to follow the basic instructions
//in if sttatemnt another if also we have to write or else if also possible
//else is not possible to write a condition only we write condition in if block or else if block