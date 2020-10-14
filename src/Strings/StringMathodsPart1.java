package Strings;

public class StringMathodsPart1 {

	public static void main(String[] args) {
		//creation of string objest
		//by String Literal
		String s1 = "My name is manish";
		//By new keyword
		String s2 = new String("My name is manish");
		//System.out.println(s1.equals(s2)); //compare values
		//System.out.println(s1==(s2));// compare references not value
		
		//Java String toUpperCase() and toLowerCase() method
		String s = "SacHin";
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		
		//string trim() method eliminates white spaces before and after string
		String s3= "  String  ";
		//System.out.println(s3.trim());
		
		//string charAt() method returns a character at specified index
		String s4 = "Manish";
		//System.out.println(s4.charAt(4));
		
		//string length() method returns length of the string
		String a = "manish";
		String a1 = "My name is manish";
		//System.out.println(a.length());
		//System.out.println(a1.length());
		
		//string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
		int i = 23;
		char [] ch = {'a','b','c','d'};
		String s5 = String.valueOf(i);
		String c = String.valueOf(ch);
		//System.out.println(s5+10);
		//System.out.println(s5.length());
		//System.out.println(c+10);
		//System.out.println(c.length());
		
		//string replace() method replaces all occurrence of first sequence of character with second sequence of character.
		String s6 = "java is programming Language, java is oops language, java is easy language";
		//String replaceString = s6.replace("java","kava");
		//System.out.println(replaceString);
		
		//string concat() method combines specified string at the end of this string
		String s7 = "ram goes to home, ";
		String s8 = "he also goes to school";
		//System.out.println(s7.concat(s8));
		//System.out.println(s7+s8);
		
		/*
		 * //string split() method splits this string against given regular expression
		 * and returns a char array String s9 =
		 * "java string split method by javatpoint"; String [] spParts = s9.split(" ");
		 * //String [] s10Parts = s9.split(" ",4); for(int i=) {
		 * System.out.print(str+","); }
		 */
		
		
		
		
		
		
		
		

	}

}
