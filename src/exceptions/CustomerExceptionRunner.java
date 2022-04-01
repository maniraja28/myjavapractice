package exceptions;

public class CustomerExceptionRunner {
	// elgible for vote registration
	// 18 years are there youre elgible for registration
	public static void main(String[] args) {
		User u1 = new User();
		u1.setAge(19);
		u1.setGender('m');
		u1.setName("raja");

		User u2 = new User();
		u2.setGender('f');
		u2.setAge(16);
		u2.setName("fathima");

		if (u1.getAge() >= 18) {
			System.out.println("you are elgibile for voting");
		} else {
			UserNotElgibleForRegistrationException unefre = new UserNotElgibleForRegistrationException(
					"user1 is not elgibile for registration");

			throw unefre;
		}
		if (u2.getAge() >= 18) {
			System.out.println("you are elgibile for voting");
		} else {
			UserNotElgibleForRegistrationException unefre = new UserNotElgibleForRegistrationException(
					"user2 is not elgibile for registration");
			throw unefre;
		}

	}
}

class User {
	private String name;
	private int age;
	private char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}

class UserNotElgibleForRegistrationException extends RuntimeException {

	public UserNotElgibleForRegistrationException() {
		super();

	}

	public UserNotElgibleForRegistrationException(String message) {
		super(message);

	}
}