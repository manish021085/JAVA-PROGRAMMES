package numberProgrammes;

public class Swap2NumberWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//before swapping value of a & b
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		//swapping
		a=a+b;  //a-> 10+20=30
		b=a-b;  //b-> 30-20=10
		a=a-b;  //a-> 30-10=20
		//after swapping value of a & b
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		

	}

}
