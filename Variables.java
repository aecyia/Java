public class Variables{
	public static void main(String[]args){
        
        String fName = "John";  // String
        String lName = "Doe";   // String
        int numA = 15;          // Integer: Whole number
        int numB = 20;          // Integer: Whole number
        int numC;               // Integer: Whole number
            numC = numB - numA;     // Equation
        int x = 1, y = 2, z = 3;    // declaring multiple variables in one line
        float floatNum = 4.20f;     // Floating point number
        char letterA = 'A';         // Character
        boolean myBool = true;      // Boolean

        System.out.println(fName + " " + lName);
        System.out.println(numA);
        System.out.println(numB);
        System.out.println("This is " + numB + " - " + numA + ": " + numC);
        System.out.println(x + y + z);
        System.out.println(floatNum);
        System.out.println(letterA);
        System.out.println(myBool);

        int myInt = 9;              // Widening Casting
        double myDouble = myInt;    // Automatic Casting: int to double
        double otherDouble = 12.13;         // Narrowing Casting
        int otherInt = (int) otherDouble;   // Manual Casting; double to int

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(otherDouble);
        System.out.println(otherInt);

        // This is a line comment
		/*
            This
			is
			a
			multi-line
			comment
            Sources
                https://www.w3schools.com/java/java_comments.asp
                https://www.w3schools.com/java/java_variables.asp
                https://www.w3schools.com/java/java_data_types.asp
                https://www.w3schools.com/java/java_type_casting.asp
        */
    }
}