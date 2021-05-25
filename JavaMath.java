// Math stuff
public class JavaMath {
	public static void main(String[]args) {
		// Outputs the maximum value: 10
		System.out.println(Math.max(5, 10));
		// Outputs the minimum value: 5
		System.out.println(Math.min(5, 10));
		// Outputs the square root of 100: 10.0
		System.out.println(Math.sqrt(100));
		// Outputs the absolute value of -100: 100
		System.out.println(Math.abs(-100));
		// Outputs a random number between 0 and 1
		System.out.println(Math.random());
		// outputs a random number between 0 and 100
		int randomNum = (int)(Math.random() * 101);
		System.out.println(randomNum);
	/*
	Sources
		https://www.w3schools.com/java/java_math.asp
	*/
	}
}