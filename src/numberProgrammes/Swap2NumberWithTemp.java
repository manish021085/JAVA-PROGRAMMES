package numberProgrammes;

public class Swap2NumberWithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//before swapping value of a & b
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		//swapping
		int t; //take temporary variable
		t = a; //t=10
		a = b; //a=20
		b = t; //b=20
		//after swapping value of a & b
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		

	}

}
