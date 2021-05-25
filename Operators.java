//	Operators Overview
public class Operators {
	public static void main(String[] args) {

		int x = 100, y = 50, z = 250;
		int sum1 = x + y;		//	150 (100 + 50)
		int sum2 = sum1 + z;	//	400 (150 + 250)
		int sum3 = sum2 + sum2;	//	800 (400 + 400)

		System.out.println(x);		//	100
		System.out.println(y);		//	50
		System.out.println(z);		//	250
		System.out.println(sum1);	//	150
		System.out.println(sum2);	//	400
		System.out.println(sum3);	//	800

		System.out.println(x + y);	//	150		addition
		System.out.println(x - y);	//	50		subtraction
		System.out.println(x * y);	//	5000	multiplication
		System.out.println(x / y);	//	2		division
		System.out.println(x % y);	//	0		modulus: returns the division remainder
		System.out.println(++ z);	//	251		increment: increases value by 1
		System.out.println(-- z);	//	250		decrement: decreases value by 1; same value since ++z - 1 is 250
		System.out.println(x == y); //	false	equal to
		System.out.println(x != y); //	true	not equal to
		System.out.println(x > y);	//	true	greater than
		System.out.println(x < y);	//	false	less than
		System.out.println(x >= y); //	true	greater than or equal to
		System.out.println(x <= y); //	false	less than or equal to
		System.out.println(x < y && x < z); 		//	false	logical and
		System.out.println(x < y || x < z); 		//	true	logical or
		System.out.println( ! (x < y && x < z) ); 	//	true	logical not

		int a = 1000;
		System.out.println(a);		//	a		1000
		System.out.println(a +- 5);	//	a + 5	995
		System.out.println(a -= 5);	//	a - 5	995
		System.out.println(a *= 5);	//	a * 5	4975
		System.out.println(a /= 5);	//	a / 5	995
		System.out.println(a %= 5);	//	a % 5	0
		System.out.println(a &= 5);	//	a & 5	0
		System.out.println(a |= 5);	//	a | 5	5
		System.out.println(a ^= 5);	//	a ^ 5	0
		System.out.println(a >>= 5);//	a >> 5	0
		System.out.println(a <<= 5);//	a << 5	0
		/*
		Sources
			https://www.w3schools.com/java/java_operators.asp

		*/
	}
}