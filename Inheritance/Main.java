public class Main {
	public static void main(String[] args) {
		M1 m1 = new M1();
		M0.leftClick();
		m1.rightClick();
		m1.scrollUp();
		m1.scrollDown();

		M2 m2 = new M2();
		m2.leftClick();
		m2.rightClick();
		m2.scrollUp();
		m2.scrollDown();
		m2.connect();

		M3 m3 = new M3();
		m3.leftClick();
		m3.rightClick();
		m3.scrollUp();
		m3.scrollDown();
	}
}
/*
ource(s): https://www.youtube.com/watch?v=zbVAU7lK25Q
 */
