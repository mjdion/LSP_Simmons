package org.howard.edu.lsp.assignment5.integerset;

import java.util.*;



public class IntegerSet {
	private ArrayList<Integer> list = new ArrayList <>();
	
	
	/** Clears the internal representation of the set
	 * 
	 */
	public void clear() {
		list.clear();
		
	};
	/** Function below adds requested element into list 
	 * if element is already in list it does nothing
	 * @param int 
	 * 
	 */
	
	public void add (int item) {
		if(list.contains((item))) {
			System.out.println("Item already in list");
			
		}
		else {
		list.add(item);
		System.out.println(list);
		}

		
	};
	/** Function below returns the size of the list as an integer 
	 * 
	 */
	public int length() {	
		return list.size();
	}
	
	/** Function below returns True if sets are the same size and false if not
	 * To be more efficient the function first checks if the lists are even the same size
	 * After sorting the lists are then compared element by element
	 */
	public boolean equals(IntegerSet b) {
		int a_total = 0;
		ArrayList<Integer> list2 = b.list;
		
		ArrayList <Integer> temp_1 = list;
		ArrayList <Integer> temp_2 = list2;
		
		Collections.sort(temp_1);
		Collections.sort(temp_2);
		if (list.size() != list2.size()) {
			return false;
		}
		
		for(int i = 0; i<temp_2.size(); i++) {
			if(temp_1.get(i)!=temp_2.get(i)) {
				return false;
				
			}
		
			
			
			
			
		}
		
		
		return true;
		
		
		
		
	};
	
	/** Function below returns true or false based on whether or not the element
	 * exists in the requested list 
	 * 
	 */
	
	
	public boolean contains(int b) {
		if(list.contains(b)) {
			return true;
		}
		return false;
		
	};
	/** Function below returns True if the list size is 0 and false if it is not
	 * 
	 */
	boolean isEmpty(){
		if (list.size() == 0) {
			return true;
			
		}

		return false;
		
		
		
		
	};
	/** Function below removes the element passed in  and if the list is already empty
	 * the function throws an exception
	 * 
	 */
	
	public void remove  (int item) throws IntegerSetException {
		//System.out.println("we are in the remove function");
		for(int i = 0; i<list.size();i++) {
			if (list.get(i) == item) {
				//System.out.println(i);
				list.remove(i);
			};
		}
		;
	
	
		
	};
	/** Function below finds the difference between two sets and prints the result
	 * 
	 * 
	 */
	
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> temp_list = list;
		ArrayList<Integer> temp_list2 = intSetb.list;
		int total = 0;
		int total_2 = 0;
		
		for(int i=0;i<temp_list.size();i++) {
			total = total + temp_list.get(i);
			
		};
		for(int i=0;i<temp_list2.size();i++) {
			total_2 = total_2 + temp_list2.get(i);
			
		};
		System.out.println(total-total_2);
		
		
		
		
	}
	
	
	;
	/**Function below combines the two sets
	 * 
	 * 
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer>list1 = list;
		ArrayList<Integer>list2 = intSetb.list;
		
		for(int i = 0; i<list2.size(); i++) {
			list1.add(list2.get(i));
		};
		System.out.println("result of union:");
		System.out.println(list1);
		
	};
	/** If there are any common elements between two sets
	 * the function below will create an Integer set of these sets
	 * 
	 */
	
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> temp=intSetb.list;
	      
	       list.retainAll(temp);
	      
	       IntegerSet new_set= new IntegerSet();
	      
	     
			
		};
		
		
		
		

	/** Function below returns largest element unless the set is empty.
	 * 
	 * 
	 */
	
	public int largest()throws IntegerSetException  {
		if(list.size()==0) {
			  IntegerSetException e= new IntegerSetException();
	           throw e;
	       }
		int largest = list.get(0);
		for(int i = 0;i < list.size(); i++) {
			if(list.get(i)>largest) {
				largest = list.get(i);
			}
			
		};
		return largest;
		
		
	};	
	
	/** Function below returns smallest element unless the set is empty.
	 *  
	 * 
	 */
	public int smallest() throws IntegerSetException {
		
		  if(list.size()==0) {
			  IntegerSetException e= new IntegerSetException();
	           throw e;
	       }
	      
	       int min= list.get(0);
	      
	       for(int i=0;i<list.size();i++) {
	           if(list.get(i)<min) {
	               min=list.get(i);
	           }
	        
	}	
	;
	// set difference, i.e. s1 - s2
	
	return min;
	
	};
	/** Function below converts the integerset values to a string.
	 * 
	 * 
	 */
	public String toString() {
		String intset_string = list.toString();
		return intset_string;
		
	};
}
	;
	
	
