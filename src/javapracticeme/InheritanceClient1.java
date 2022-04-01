package javapracticeme;

public class InheritanceClient1 {
	public static void main(String[] args) {

		Dog1 d1 = new Dog1();
		d1.setAge("1m");
		d1.setColour("white");

		Dog1 d2 = new Dog1();
		d2.setAge("1y 1m");
		d2.setColour("brown");
		d1.speek();

		Cat1 c1 = new Cat1();
		c1.setAge("3m");
		c1.setColour("green");

		Cat1 c2 = new Cat1();
		c2.setAge("4m");
		c2.setColour("black");
		c2.eat();
		System.out.println("Dog d1 age is" + d1.getAge());
		System.out.println("Dog d1 colour is" + d1.getColour());
		System.out.println("Dog d2 age is" + d2.getAge());
		System.out.println("Dog d2 color is" + d2.getColour());
		System.out.println("Cat c1 age is" + c1.getAge());
		System.out.println("Cat c2 color is" + c2.getColour());

	}

}
