package org.howard.edu.lsp.assignment5.integerset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.howard.edu.lsp.assignment4.IntegerSet;
import org.howard.edu.lsp.assignment4.IntegerSetException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
/** 
 * Author: Dion Simmons
 * Below is a series of test cases for the IntegerSet class
 * 
 */

public class IntegerSetTest {
	private ArrayList<Integer> list = new ArrayList <>();
	public IntegerSet set1;
	public IntegerSet set3;
	public IntegerSet master_set;
	public IntegerSet set4;
	/** Method below initializes 4 integer sets before each 
	 * test
	 */
	
	@BeforeEach
	public void init() {
		System.out.println("*************************");
		set1 = new IntegerSet();
		set3 = new IntegerSet();
		master_set = new IntegerSet();
		set4 = new IntegerSet();
	}
	/** Method below Tests the length method twice
	 */
	
	@Test
    @DisplayName("Test case for Length function")
    public void testLength() {
		set1.add(2);
		set3.add(2);
		set1.add(0);
		
		IntegerSet expected = set3;
		assertEquals(2,set1.length());
		assertEquals(1,set3.length());
		
		
		
		
       // JUnit test case(s) for remove
		
    }
	@Test
    @DisplayName("Test case for Largest function")
    public void testLargest() throws IntegerSetException {
		set1.add(10);
		set1.add(5);
		
		set1.add(0);
		set1.add(30000);
		set1.add(30001);
		int result = set1.largest();
		assertEquals(30001,result);
		
	
		
		
		
		
       // JUnit test case(s) for remove
		
    }
	/** Method below Tests smallest function using the assert method
	 */
	@Test
	@DisplayName("Test for  smallest function")
	public void test() throws IntegerSetException{
		set1.add(0);
		set1.add(1);
		set1.add(44);
		set3.add(3);
		set3.add(4);
		int result  = set1.smallest();
		assertEquals(0,result);
	}
	/** Method below Tests the the isEmpty function thrice with the middle test case failing 
	 */
	
	@Test
	@DisplayName("Test for isEmpty Function")
	public void testisEmpty() throws IntegerSetException {
		System.out.println(set1);
		assertTrue(set1.isEmpty());
		set1.add(0);
		assertTrue(set1.isEmpty());
		set1.remove(0);
		assertTrue(set1.isEmpty());
		//should fail middle assertion
	}
	/** Method below Tests the remove function by first testing the length
	 * then checking whether that value is still contained on in the set
	 */
	@Test
	@DisplayName("Test for  Remove function")
	public void testRemove() throws IntegerSetException {
		set1.add(0);
		set3.add(3);
		set1.add(2);
		set1.remove(0);
		int result = 1;
		assertEquals(1,set1.length());
		
		assertTrue(set1.contains(0));
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			set1.remove(0);
			
		});
	
		
	}
	/** Method below Tests the add function with the contain methods
	 * as well as comparing it to the set it should look like
	 */
	@Test
	@DisplayName("Test for  Add function")
	public void testAdd() {
		set4.add(0);
		set4.add(4);
		set4.add(3);
		master_set.add(0);
		master_set.add(4);
		master_set.add(3);
		
		String result = set4.toString();
		String expected = master_set.toString();
		assertTrue(set4.length() == 3);
		assertTrue(set4.contains(3));
		assertTrue(set4.contains(0));
		assertTrue(set4.contains(4));
		assertEquals(expected,result);
		
		
		
	}
	/** Method below Tests the Contains function both cases pass
	 */
	@Test
	@DisplayName("Test for  Contains function")

	public void testContains() {
		
		set1.add(0);
		set3.add(3);
		set1.add(2);
		assertTrue(set1.contains(0));
		assertTrue(set3.contains(3));
	}
	
	@Test
	@DisplayName("Test for the toString function")

	public void testToString() {
		
		
		set1.add(0);
		set3.add(0);
		set1.add(47);
	
		set1.add(50);
		set3.add(47);
		set3.add(50);
		String x = set1.toString();
		String y = set3.toString();
	
		assertEquals(x,y);
		
		//below should print false
		
		set1.clear();
		String new_set = set1.toString();
		assertEquals(x,new_set);
		
		
	}
	@Test
	@DisplayName("Test for the equals function")

	public void testEquals() {
		
		set1.add(0);
		set3.add(0);
		assertTrue(set1.equals(set3));
		set1.add(5);
		set1.add(4);
		set1.add(3);
		set3.add(20);
		assertTrue(set1.equals(set3));
		//this should fail
		
	}
	/** Method below Tests the Union function with the help of the the .toString function
	 */
	@Test
	@DisplayName("Test for the Union Function")
	public void testUnion() {
		set1.add(5);
		//set1.add(4);
		//set1.add(3);
		set3.add(20);
		String expect = "[5, 20]";
		set1.union(set3);
		assertEquals(expect,set1.toString());
		set3.add(60);
		set3.add(2);
		set1.union(set3);
		String result = set1.toString();
		String expected = "[5, 20, 60, 2]";
		assertEquals(expected,result);
	
		
		
	
}
	/** Method below Tests the Difference function with the help of the the .toString function
	 */
	@Test 
	@DisplayName("Test for Difference")
	
	public void testDifference() throws IntegerSetException {
		set1.add(444);
		//set1.add(4);
		//set1.add(3);
		set3.add(444);
		String expected = "[5, 20]";
		set1.diff(set3);
		String x  = set1.toString();
		System.out.println("Diff test" + x);
		//assertEquals(expect,set1.toString());
	
	
		
		
	}



	


	

}
