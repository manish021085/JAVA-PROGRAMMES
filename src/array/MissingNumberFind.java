package array;

public class MissingNumberFind {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,8,9};
		int sumWithMissing = 0;
		System.out.println(a.length);
		for(int i = 0; i<a.length; i++) {
			sumWithMissing = sumWithMissing+a[i];
		}
		System.out.println("Sum of the element with missing  ::"+sumWithMissing);;
		int sumWithoutMissing = 0;
		for(int j = 0; j<=a.length+1; j++) {
			sumWithoutMissing = sumWithoutMissing+j;
		}
		System.out.println("Sum of element without missing ::"+sumWithoutMissing);
		
		System.out.println("Missing element is ::"+(sumWithoutMissing-sumWithMissing));

	}

}
