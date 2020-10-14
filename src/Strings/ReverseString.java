package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Manish";
		System.out.println("Original string is :: "+name);
		System.out.println("Length of the string is :: "+name.length());
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("Reversr of the string is :: "+rev);
		
		System.out.println("*****************************");
		
		//using stringbuffer
		String s = "My java";
		System.out.println("Original string is :: "+s);
		StringBuffer str = new StringBuffer(s);
		System.out.println("Reverse String is :: "+str.reverse());
		
		

	}
	
	

}
