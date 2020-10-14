package numberProgrammes;

public class FibonacciSeries2 {

	public static void fibonacciSeries(int count) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		if (count == 1) {

			System.out.print(n1 + " " + n2);
		} else if(count>1){
			
		}
			for (int i = 2; i <= count; ++i) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;

			}

		}
	

	public static void main(String[] args) {
		fibonacciSeries(9);
		// fibonacciSeries(1);

	}

}
