package array;

public class LargestNumber {

	public static void main(String[] args) {
		int temp;
		int [] array = {10,20,30,40,50,60,70};
		System.out.println(array.length);
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ,");
			for(int j=i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		System.out.println("**************************");
		System.out.println("Largest number : " +array[array.length-1]);
		System.out.println("Second Largest number : " +array[array.length-2]);
		System.out.println("Third Largest number : " +array[array.length-3]);
		System.out.println("Fourth Largest number : " +array[array.length-4]);

	}

}
