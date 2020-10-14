package List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class list1 {

	public static void main(String[] args) {
//		List<String> l= new LinkedList<String>();
//		l.add("babbu");
//		l.add("bunty");
//		//  l.add(String e);
//		l.add("hghghg");
//;	//	for(int i=0; i<l/+) {//
////			if(l.get(i).equals(anObject)("bunty"))
////			System.out.println(l.get(i));
//		int i =10;
//		Integer x = 100;
//		}
		Student s1 = new Student(1,100);
		Student s2 = new Student(2,200);
		Student s3 = new Student(3,300);
		
		
//		s1.id=100;
//		s1.roll =1;
		
		List<Student> stu = new LinkedList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(new Student(4,400));
		
		for(Student st:stu) {
			System.out.println(st.id +" "+st.roll);
		}
		
		stu.forEach(t->System.out.println(t.id+" "+t.roll));
		
		int[]  a = {1,5,3,1,3,4};
		Set<Integer> s = new LinkedHashSet();
		for(int i=0; i<a.length; i++) {
			s.add(a[i]);
			
			
		}
		System.out.println(s);
		
		int [] b = new int[s.size()];
		for(int j =0;j<s.size();j++) {
			
		}
		
		int k=0;
		Iterator sh =s.iterator();
		while (sh.hasNext()) {
			b[k]=(int) sh.next();
			k++;
		}
		
		
		
		
		
		
		
		//{{1,100},{2,200},{3,300}}
		
		
		
		
		
//		for(String s:l) {
//			System.out.print(s +",");
//		}
		
//		l.forEach(x->System.out.println(x));
//	
//		//
//		Iterator itr =l.iterator();
//		
//		
//		System.out.println();
//		
//		int [] a = {1,2,3,4,5,6,7,};
//		for(int aa:a) {
//			System.out.println(aa+",");
//		}
//		
//		
//		
//		
//
	}

}
