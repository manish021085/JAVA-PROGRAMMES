package numberProgrammes;

public class SumOfdigits {
	public static void getSum(int num) {
		int sum =0;
		while(num!= 0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("sum of digits  ::: "+sum);
		
	}
	
	public static void main(String[] args) {
		getSum(12345);
		SumOfdigits.getSum(2345);
	}
	

}
