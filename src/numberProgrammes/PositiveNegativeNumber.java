package numberProgrammes;

public class PositiveNegativeNumber {
	
	public static void isNumberType(double num) {
		if(num < 0.0) {
			System.out.println(num +" is negative");
		}
		else if(num > 0.0) {
			System.out.println(num +" is positive");
		}
		else {
			System.out.println(num+" is zero");
		}
	}
	
	public static void main(String[] args) {
		isNumberType(10);
		isNumberType(-10);
		isNumberType(0);
	}

	
}
