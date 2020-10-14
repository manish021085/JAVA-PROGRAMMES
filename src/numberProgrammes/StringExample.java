package numberProgrammes;

public class StringExample {
	
	public static void main(String[] args) {
		
		String s= null;
		String s1= "";
		String s2 = "girjesh";
		
		//System.out.println(s1.length());
		//System.out.println(s.length());
		
	}
	public void checkString(String name) {
	if(name == null) {
			System.out.println("String is null");
			
		}
		else if (name == "") {
			System.out.println("NO character in string");
		}
		else {
			System.out.println("String is"+ name.length());
		}
	}
	
	
	

}
