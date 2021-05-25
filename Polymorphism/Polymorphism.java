class Bird {
	public void sing() {
		System.out.println("tweet");
	}
}
class Duck extends Bird {
	public void sing() {
		System.out.println("quack");
	}
	// runs this instead of the method sing() in Bird {}
}
class Chicken extends Bird {
	public void sing(String song) {
		System.out.println("bwok");
	}
	// must be the same parameters as public void sing(){}
}
class Robin extends Bird {
	// knows everything in class Bird {}
}
public class Polymorphism {
	public static void main (String[] args) {
		Bird b = new Bird();
			b.sing();	// tweet
		Duck d = new Duck();
			d.sing();	// quack
		Chicken c = new Chicken();
			c.sing();	// tweet not bwok
		Robin r = new Robin();
			r.sing();	// tweet
        System.out.println("x");
    }
}
/* Source(s):
	https://www.youtube.com/watch?v=Ft88V_rDO4I
*/