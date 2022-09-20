package haskMap;

import java.util.HashMap;

public class keyItration {
	public static void main(String[] args) {
		HashMap<Integer, String >lms =new HashMap<>();
		lms.put(812, "Raju");
		lms.put(801, "Karthik");
		lms.put(813, "Pandian");
		lms.put(810, "Muthu");
		lms.put(508, "hi");
		lms.forEach((x,y) ->System.out.println(x+" "+y));
//		for(Integer i:lms.keySet()) {
//			System.out.println(i);
//		}
//		
	}
}
