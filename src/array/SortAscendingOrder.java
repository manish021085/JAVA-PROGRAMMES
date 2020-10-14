package array;

public class SortAscendingOrder {

	public static void main(String[] args) {
		int [] arr = new int[] {5,2,8,7,1};
		int temp=0;
		
		//displaying all elements
		System.out.println("elements of original array :: ");
		//for loop
//		for(int i = 0; i<arr.length; i++) {
//			System.out.print(arr[i]+",");
//			
//		}
		//for each loop
		for(int ar:arr) {
			System.out.print(ar+",");
		}
		
		//sorting array
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println();
		
		//displaying element after sorting
		System.out.println("Element after sorting in assending order");
		for(int ar:arr) {
			System.out.print(ar+",");
		}
		

	}

}
