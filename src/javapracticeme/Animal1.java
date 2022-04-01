package javapracticeme;

public class Animal1 {
	private String colour;
	private String age;// state
//	public Animal1(String colour, String age) {
	// super();
	// this.colour = colour;
	// this.age = age;
	// }

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void speek() {
		System.out.println("Animal is speeking");
	}

}
