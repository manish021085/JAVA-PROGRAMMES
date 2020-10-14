package array;

public class MinMaxElement1 {
	
	public static void findElement(int []a) {
		int min = a[0];
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
			else if(max <a[i]) {
				max = a[i];
			}
		}
		System.out.println("Minimim element of array is "+ min);
		System.out.println("Maximum element of array is "+ max);
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,5,6};
		findElement(a);
	}

}
