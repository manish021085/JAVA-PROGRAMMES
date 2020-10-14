package array;

public class DuplicatElement {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,5,4,3,6,7,8,9,10,12,13,12,14,15,45,45,23,57,68,23};
		//print array
		System.out.println("Given Array is ::");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();

		//search duplicate elements
		System.out.println("Duplicate array elements are ::");
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.print(a[i]+",");
					System.out.println("bnbnbnb");
				}
			}
		}
	}

}
