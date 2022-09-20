package haskMap;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Naruto",16,"seconday",17283937648l);
		Student s2=new Student("Saskuae",17,"Higher seconday",143847837649l);
		Student s3=new Student("Kakshi",28,"Engineering",17284987640l);
		Student s4=new Student("Jiraya",46,"phd",172833457649l);
		Student s5=new Student("Minato",33,"Doctor",37283937649l);
		Student s6=new Student("Kushina",26,"Nurse",27283937649l);
		HashMap<Long,Student> s=new HashMap<>();
	
		s.put(s1.getAdharNo(), s1);
		s.put(s2.getAdharNo(), s2);
		s.put(s3.getAdharNo(), s3);
		s.put(s4.getAdharNo(), s4);
		s.put(s5.getAdharNo(), s5);
		s.put(s6.getAdharNo(), s6);
//		System.out.println(s.keySet());
//		s.forEach((x,y)->System.out.println(y));
		for(Long l:s.keySet()) {
			//System.out.println(s.get(l));
//			System.out.println(l);
		}
		//int max=0;
//		int max=s1.getAge();
//		
//		String a="";
//		for(Long l:s.keySet()) {
//			if(s.get(l).getAge()>=max) {
//				max=s.get(l).getAge();
//				a=s.get(l).getName();
//			}
//		}
//		System.out.println(a);
//Iterator<Student> it=s.values().iterator();
//while(it.hasNext()) {
//	if(it.next().getQualification().equals("Doctor")) {
//		it.remove();
//	}
//	
//}System.out.println(s);
//Iterator<Student> a=s.values().iterator();
//while(a.hasNext()) {
//	if(a.next().getName().startsWith("S")) {
//		a.remove();
//	}
//}
//System.out.println(s);
//
		Iterator<Long> b=s.keySet().iterator();
		while(b.hasNext()) {
			if(b.next()%2==0) {
				b.remove();
			}
		}
		System.out.println(s);




//		Iterator<Long> it=s.keySet().iterator()	;
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		Iterator<Student> ite=s.values().iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
//	}
}}
