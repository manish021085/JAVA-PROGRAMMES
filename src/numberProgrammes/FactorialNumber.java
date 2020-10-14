package numberProgrammes;

public class FactorialNumber {
	
	public void  factorial(int num) {
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the num ::: "+fact);
		
	}
	
	public static void main(String[] args) {
		FactorialNumber f = new FactorialNumber();
		f.factorial(4);
	}

}
