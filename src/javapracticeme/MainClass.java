package javapracticeme;

public class MainClass {
	
	static int methodOne(int i) {
		return methodTwo(i *= 11);// 121
	}

	static int methodTwo(int i) {
		return methodThree(i /= 11);// 11

	}

	static int methodThree(int i) {
		return methodFour(i -= 11);// 0
	}

	static int methodFour(int i) {
		return i += 11;// 11
	}

	public static void main(String[] args) {
		System.out.println(methodOne(11));
	}
}
