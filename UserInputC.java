import java.util.Scanner;

public class UserInputC {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the following values in separate lines");
    System.out.println("boolean");
    System.out.println("byte");
    System.out.println("double");
    System.out.println("float");
    System.out.println("int");
    System.out.println("long");
    System.out.println("short");
    System.out.println("string text");

    boolean booleanValue = myObj.nextBoolean();
    byte byteValue = myObj.nextByte();
    double doubleValue = myObj.nextDouble();
    float floatValue = myObj.nextFloat();
    int intValue = myObj.nextInt();
    long longValue = myObj.nextLong();
    short shortValue = myObj.nextShort();
    String stringValue = myObj.nextLine();

    System.out.println("Boolean: " + booleanValue);
    System.out.println("Byte: " + byteValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("Float: " + floatValue);
    System.out.println("Int: " + intValue);
    System.out.println("String: " + stringValue);
    System.out.println("Long: " + longValue);
    System.out.println("Short: " + shortValue);
  }
}