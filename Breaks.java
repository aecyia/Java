// Break and Continue for FOR LOOPS and WHILE LOOPS
public class Breaks{
	public static void main(String[] args) {
		// FOR LOOP: Break if i == 4
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			/* Prints out 0123
				Numbers from 0 to 10 ( i < 10 )
				Stops at 4 ( i == 4 )
			*/
			System.out.print(i);
		}
		System.out.println("\n");
		// FOR LOOP: Continue if j == 4
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
			continue;
			}
			/*	Prints out 012356789
				Numbers from 0 to 10
				Not including 10 ( j < 10 )
				Not including 4 ( j == 4 )
			*/
			System.out.print(j);
		}
		System.out.println("\n");
		// WHILE LOOP: Break if k == 4
		int k = 0;
		while (k < 10) {
			System.out.println(k);
			k++;
			if (k == 4) {
				break;
			}
			/*	Prints out 0123
				Numbers from 0 to 10 ( k < 10 )
				Stops at 4 ( k == 4 )
			 */
		}
		System.out.println("\n");
		// WHILE LOOP: CONTINUE if l == 4
		int l = 0;
		while (l < 10) {
			if (l == 4) {
				l++;
				continue;
			}
			System.out.println(l);
			l++;
			/*	Prints out 012356789
				Numbers from 0 to 10
				Not including 10 ( l < 10 )
				Not including 4 ( l == 4 )
			 */
		}
	/*
	Sources
		https://www.w3schools.com/java/java_break.asp
	*/
	}
}