package haskMap;

import java.util.HashMap;

public class Keyitretration {
	public static void main(String[] args) {
		HashMap<Integer, String >lms =new HashMap<>();
		lms.put(812, "Raju");
		lms.put(801, "Karthik");
		lms.put(813, "Pandian");
		lms.put(810, "Muthu");
		lms.put(508, "hi");
		System.out.println(lms);
		for(Integer i:lms.keySet()) {
			System.out.println(i);
		}
		
	}
}
