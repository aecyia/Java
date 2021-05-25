// Arrays overview
public class Arrays {
	public static void main(String[] args) {
		// Array of "cars"
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Cooper"};
		// Prints out the number of "cars"
		System.out.println(cars.length);//	5
		System.out.println(cars[0]);	//	Volvo
		System.out.println(cars[1]);	//	BMW
		System.out.println(cars[2]);	//	Ford
		System.out.println(cars[3]);	//	Mazda
		System.out.println(cars[4]);	//	Cooper
		// Sets Array item 0 to Toyota instead of Volvo
		cars[0] = "Toyota";
		System.out.println("\n" + cars[0] + "\n");	// Toyota
		// Prints out the new list of "cars" in 2 different ways
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("\n");
		for (String k : cars) {
			System.out.println(k);
		}
		System.out.println("\n");
		// Array of "myNumbers"
		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int x = myNumbers[1][2];
		// 7 is the 2nd array [1] and the third element [2] since 0 is counted as a value
		System.out.println(x);
		System.out.println("\n");
		// Prints all the "myNumbers"
		for (int i = 0; i < myNumbers.length; ++i) {
			for(int j = 0; j < myNumbers[i].length; ++j) {
				System.out.println(myNumbers[i][j]);
			}
		}
	/*
	Sources
		https://www.w3schools.com/java/java_arrays.asp
	*/
	}
}