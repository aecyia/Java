package Interface;
// Example on Interfaces and implements
interface WaterBottleInterface {
	String blue = "Blue";
	String green = "Green";
	String red = "Red";
	void fillUp();
	void pourOut();
}
/*
+	The class ( InterfaceExample ) uses the interface ( WaterBottleInterface )
+	Everything in the WaterBottleInterface can be used in the InterfaceExample
*/
public class InterfaceExample implements WaterBottleInterface {
	public static void main(String[] args){
		// Uses and outputs "blue" from the WaterBottleInterface
		System.out.println(blue);
		// Creates a new interface example
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
		ex.pourOut();
	}
	// Uses the "fillUp()" from the WaterBottleInterface with a void
	@Override
	public void fillUp(){
		System.out.println("Filled");
	}
	// Uses the "pourOut()" from the WaterBottleInterface with a void
	@Override
	public void pourOut(){
		System.out.println("Poured out");
	}
}
/* Source(s):
	https://www.youtube.com/watch?v=kTpp5n_CppQ
*/