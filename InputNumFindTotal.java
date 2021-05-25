// Input numbers to find a total
import java.util.*;

public class InputNumFindTotal {
	public static void main(String[] args) {
		// MSG for user input
		System.out.print("Enter a number (-1 to stop): ");
		// Variables to get user input
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 0;
		// Get User Input; -1 to stop
		while (num != -1) {
			// Calculates the total
			total += num;
			// Continuous loop until stop
			System.out.print("Enter a number (-1 to stop): ");
			// Get user input
			num = sc.nextInt();
		}
		// Outputs the total
		System.out.println("The total is: " + total);
	}
}