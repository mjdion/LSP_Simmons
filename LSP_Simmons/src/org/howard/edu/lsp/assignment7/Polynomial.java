package org.howard.edu.lsp.assignment7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to implement a Polynomial as a list of terms, where each term has an
 * integer coefficient and a nonnegative integer exponent
 * 
 * @author your name
 */
public class Polynomial {
	// instance variable declarations go here
	private ArrayList<Term> term;

	/**
	 * Creates a new Polynomial object with no terms
	 */
	public Polynomial() {

		term = new ArrayList<Term>();
	}

	/**
	 * Inserts a new term into its proper place in a Polynomial
	 * 
	 * @param coeff
	 *            the coeffiecent of the new term
	 * @param expo
	 *            the exponent of the new term
	 */
	public void insert(int coeff, int expo) {
		Term t = new Term(coeff, expo);
		ArrayList<Term> temp = new ArrayList<Term>();

		int insert=-1;
		int i;
		if (term.size() == 0) {
			term.add(t);
		} else {
			for (i = 0; i < term.size(); i++) {
				if (term.get(i).getExponent() > expo) {
					temp.add(t);
					//temp.add(term.get(i));
					insert =i;
					
					for (int j = i; j < term.size(); j++) {
						temp.add(term.get(j));
					}
					break;
					
				}else{
					temp.add(term.get(i));
				}

			}
			/*if(insert !=-1)
			  term.set(i, t);
			else*/
			if (insert ==-1)
			  temp.add(t);
			term = temp;
		}

		System.out.println("insert method called for " + coeff + " " + expo);
	}

	/**
	 * Deletes the first occurrence of a specified term from a Polynomial, or
	 * prints an appropriate message if the term does not appear in the
	 * Polynomial
	 * 
	 * @param coeff
	 *            the coeffiecent of the term to be deleted
	 * @param expo
	 *            the exponent of the term to be deleted
	 */
	public void delete(int coeff, int expo) {
		boolean find = false;
		Iterator<Term> it = term.iterator();
		while (it.hasNext()) {
			Term t = it.next();
			if (t.getcoef() == coeff && t.getExponent() == expo) {
				it.remove();
				find = true;
				break;
			}
		}
		if (!find) {
			System.out.println("No such term exist");
		} else
			System.out.println("delete method called for " + coeff + " " + expo);
	}

	/**
	 * Returns the product of all the terms of a Polynomial, as a String E.g.
	 * for the polynomial 3x^2 + 7x^3 + 2x^5, will return 42x^10
	 * 
	 * @return the polynomial product, as a String
	 */
	public String product() {

		int product = 1, sum = 0;
		for (Term t : term) {
			product *= t.getcoef();
			sum += t.getExponent();

		}
		System.out.println("product method called");
		return "Product =" + String.valueOf(product) + "x^" + String.valueOf(sum);
	}

	/**
	 * Returns a polynomial as a String in this form: 3x^2 + 7x^3 + 2x^5
	 * 
	 * @return the polynomial as a String
	 */
	public String toString() {
		String text = "";

		for (int i = 0; i < term.size(); i++) {
			text += term.get(i).toString();
			if (i != term.size() - 1) {
				text += "+";
			}
		}
		System.out.println("toString method called");
		return text;
	}

	/**
	 * Reverses the order of the terms of a Polynomial. E.g. the polynomial 3x^2
	 * + 7x^3 + 2x^5 would be 2x^5 + 7x^3 + 3x^2 after reversal
	 */
	public void reverse() {
		// TO DO: write method body here. The following statement is included
		// only for development purposes. Remove after implementing the method
		ArrayList<Term> temp = new ArrayList<Term>();

		for (int i = term.size() - 1; i >= 0; i--) {
			temp.add(term.get(i));
		}
		term = temp;
		System.out.println("reverse method called");
	}
}