package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatElementUsingHashSet {

	public static void main(String[] args) {
		String[] names = {"java", "jacascript", "python", "dotnet", "java", "c", "c++", "ruby", "dotnet" };
		
		//1. compare each element
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is :: "+names[i]);
				}
			}
		}
		System.out.println("*********************************");
		
		//using Hashset
		Set store = new HashSet();
		for(String name : names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate element is :: "+name);
			}
		}
		

	}

}
