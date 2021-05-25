public class Strings{
	public static void main(String[]args){

        String txt = "ABCDE";
        String firstName = "John ";
        String lastName = "Doe";
        String doubleQuotation = "We are the so-called \"Vikings\" from the north.";
        String oneQuotation = "It\'s alright.";
        String backslash = "The character \\ is called backslash.";

        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("abc"));
        System.out.println(txt.indexOf("BCD"));

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(doubleQuotation);
        System.out.println(oneQuotation);
        System.out.println(backslash);
        
        System.out.print(txt + "\n" + txt); // new line
        System.out.println(txt + "\r" + txt); // carriage return
        System.out.println(txt + "\t" + txt); // tab
        System.out.println(txt + "\b" + txt); // backspace
        System.out.println(txt + "\f" + txt); // form feed

        int x = 10;
        int y = 20;
        int z = x + y;      // z will be 30 (an integer/number)

        String a = "10";
        String b = "20";
        String c = a + b;   // z will be 1020 (a String)

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(y + b);

    /*
    Sources
        https://www.w3schools.com/java/java_strings.asp
    */
    }
}