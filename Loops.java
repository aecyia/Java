// Loops: While, For, For-Each
public class Loops {
	public static void main(String[]args) {
		/* 	While Loop
			Outputs 01234 since i < 5
		*/
		int i = 0;
		do {
			System.out.print(i);
			i++;
		}
		while (i < 5);
		System.out.println("\n");
		/*	For Loop
			Outputs 01234 since j < 5
		*/
		for (int j = 0; j < 5; j++) {
			System.out.print(j);
		}
		System.out.println("\n");
		/*	For-Each Loop
			Outputs Volvo BMW Ford Mazda
		*/
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String c : cars) {
			System.out.print(c + " ");
		}
		/*
		Notes
			+	When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
			+	Statement 1 is executed (one time) before the execution of the code block.
				+	Statement 1 sets a variable before the loop starts (int i = 0).
			+	Statement 2 defines the condition for executing the code block.
				+	Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.
			+	Statement 3 is executed (every time) after the code block has been executed.
				+	Statement 3 increases a value (i++) each time the code block in the loop has been executed.
		Sources
			https://www.w3schools.com/java/java_while_loop.asp
			https://www.w3schools.com/java/java_for_loop.asp
		*/
	}
}