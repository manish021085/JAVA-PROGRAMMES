package array;

public class MinMaxElement {
	public static void main(String[] args) {
		int []a= {22,34,45,33,49,44,12,67,78,105};
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
			else if(max <a[i]){
				max = a[i];
			}
		}
		System.out.println("Minium element of array "+min);
		System.out.println("Maximum element of array "+max);
		
	}

}


