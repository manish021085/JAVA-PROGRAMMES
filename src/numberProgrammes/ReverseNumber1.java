package numberProgrammes;

public class ReverseNumber1 {
	
	public static void reverseNumber(int num) {
		int rem, rev =0;
		while(num != 0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Reverse number ::: "+ rev);
		
	}
	
	public static void main(String[] args) {
		ReverseNumber1.reverseNumber(54321);
	}

}
