// Methods Overview
public class Methods {
	public static void main(String[] args) {
		smiley();
		exclamation("Ace");
		nameAge("Aeria", 20);
		nameAge("Aria", 25);
		System.out.println(plusX(3));
		System.out.println(xy(5, 10));
		checkAge(10);
		checkAge(20);
	}
	// smiley method outputs a smiley face
	static void smiley() {
		System.out.println("(:");
	}
	// exclamation method outputs the string with an exclamation mark
	static void exclamation(String a) {
		System.out.println(a + " ! ");
	}
	// nameAge method outputs name and age
	static void nameAge(String name, int age) {
		System.out.println(name + " " + age);
	}
	// plusX method returns the sum of 10 and x
	static int plusX(int x) {
		return 10 + x;
	}
	// xy method returns the sum of x and y
	static int xy(int x, int y) {
		return x + y;
	}
	// checkAge method returns msg based on age
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}



	static void a() {
		System.out.println("a");
	}
	/*
	Sources
		https://www.w3schools.com/java/java_methods.asp
		https://www.w3schools.com/java/java_methods_param.asp
	*/
}