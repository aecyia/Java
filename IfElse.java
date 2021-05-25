// If-Else Statements
public class IfElse {
	public static void main(String[]args) {
		// If 20 > 18, print msg
		if (20 > 18) {
			System.out.println("20 is greater than 18");
		}
		// If x > y, print msg
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("x is greater than y");
		}
		// If time < #, print msg
		int time = 24;			// Outputs Good evening.
		if (time < 10) {
			System.out.println("Good morning.");
		}
		else if (time < 20) {
			System.out.println("Good day.");
		}
		else {	// time > 20
			System.out.println("Good evening.");
		}
		// If 20 < 18, print msg, else other msg
		int timeA = 20;			//	Outputs Good evening.
		if (timeA < 18) {
			System.out.println("Good day.");
		}
		else {
			System.out.println("Good evening.");
		}
	/*
	Sources
		https://www.w3schools.com/java/java_conditions.asp
	*/
	}
}