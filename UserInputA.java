import java.util.Scanner;

public class UserInputA {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter anything:");

    String userInput = myObj.nextLine();

    System.out.println("You wrote: " + userInput);
  }
}