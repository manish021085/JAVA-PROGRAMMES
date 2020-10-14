package numberProgrammes;

public class PalindromeNumber {
	// A palindromic number is a number that remains the same when its digits are
	// reversed. Like 16461.
	public static void isPalindrome(int num) {
		int rem =0;
		int sum =0;
		int t = num;
		while(num >0) {
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num/10;
			
		}
		if (t==sum) {
			System.out.println(t + " is Palindrome");
		}
		else {
			System.out.println(t + " is not Palindrome");
		}

	}
	
	public static void main(String[] args) {
		PalindromeNumber.isPalindrome(191);
		PalindromeNumber.isPalindrome(1234321);
		PalindromeNumber.isPalindrome(123456789);
	}
}
