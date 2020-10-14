package Strings;

public class StringSwap {

	public static void main(String[] args) {
		String a = "hello";
		String b = "world";
		System.out.println("Value before swapping");
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+b);
		
		//append a&b
		a=a+b;
		
		//store initial string a in string b
		b=a.substring(0, a.length()-b.length());
		//store initial string b in string a
		a=a.substring(b.length());
		System.out.println("Value after swapping");
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+b);
		

	}

}
