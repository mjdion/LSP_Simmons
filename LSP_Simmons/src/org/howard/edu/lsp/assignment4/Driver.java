package org.howard.edu.lsp.assignment4;

public class Driver {
	
	public static void main(String args[]) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(1);
		System.out.println("set1 below");
		System.out.println(set1.toString());
		IntegerSet set2 = new IntegerSet();
		//System.out.println(set1.length());
		set2.add(3);
		set2.add(0);
		set2.add(4);
		System.out.println(set2.smallest());
		
		IntegerSet set3 = new IntegerSet();
		System.out.println(set2.contains(0));
		System.out.println(set2.isEmpty());
		set2.remove(4);
		set2.add(6);
		set2.remove(0);
		System.out.println(set2.smallest());
		
		
		System.out.println(set1.largest());
		set1.add(4);
		System.out.println(set1.largest());
		
		set1.diff(set2);
		
		set1.union(set2);
		set1.clear();
		set1.add(0);
		set1.add(67);
		set1.add(3);
		set1.intersect(set2);
		
		
		System.out.println(set3.isEmpty());
		set3.remove(0);
		//System.out.println(set1.equals(set2));
		
		System.out.println(set2.toString());
	

		
	}

}
