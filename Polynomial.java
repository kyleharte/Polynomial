import java.io.*;
import java.util.Scanner;

/**
 * This class implements a polynomial.
 * 
 * @author runb-cs112
 *
 */
public class Polynomial {
	
	/**
	 * Reads a polynomial from an input stream (file or keyboard). The storage format
	 * of the polynomial is:
	 * <pre>
	 *     <coeff> <degree>
	 *     <coeff> <degree>
	 *     ...
	 *     <coeff> <degree>
	 * </pre>
	 * with the guarantee that degrees will be in descending order. For example:
	 * <pre>
	 *      4 5
	 *     -2 3
	 *      2 1
	 *      3 0
	 * </pre>
	 * which represents the polynomial:
	 * <pre>
	 *      4*x^5 - 2*x^3 + 2*x + 3 
	 * </pre>
	 * 
	 * @param sc Scanner from which a polynomial is to be read
	 * @throws IOException If there is any input error in reading the polynomial
	 * @return The polynomial linked list (front node) constructed from coefficients and
	 *         degrees read from scanner
	 */
	public static Node read(Scanner sc) 
	throws IOException {
		Node poly = null;
		while (sc.hasNextLine()) {
			Scanner scLine = new Scanner(sc.nextLine());
			poly = new Node(scLine.nextFloat(), scLine.nextInt(), poly);
			scLine.close();
		}
		return poly;
	}
	
	/**
	 * Returns the sum of two polynomials - DOES NOT change either of the input polynomials.
	 * The returned polynomial MUST have all new nodes. In other words, none of the nodes
	 * of the input polynomials can be in the result.
	 * 
	 * @param poly1 First input polynomial (front of polynomial linked list)
	 * @param poly2 Second input polynomial (front of polynomial linked list
	 * @return A new polynomial which is the sum of the input polynomials - the returned node
	 *         is the front of the result polynomial
	 */
	public static Node add(Node poly1, Node poly2) {

	    /** COMPLETE THIS METHOD **/
		// FOLLOWING LINE IS A PLACEHOLDER TO MAKE THIS METHOD COMPILE
		// CHANGE IT AS NEEDED FOR YOUR IMPLEMENTATION
		return null;
	}
	
	/**
	 *Appends a new node to the end of an existing polynomial
	 * 
	 * @param head Head of the polynomial
	 * @param coeff New Node coefficient
	 * @param degree The Degree of the new node
	 */
	private static Node append(Node head, float coeff, int degree){
		Node node = new Node(coeff, degree, null );
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;

		return node;

	}
	/**
	 * Returns the product of two polynomials - DOES NOT change either of the input polynomials.
	 * The returned polynomial MUST have all new nodes. In other words, none of the nodes
	 * of the input polynomials can be in the result.
	 * 
	 * @param poly1 First input polynomial (front of polynomial linked list)
	 * @param poly2 Second input polynomial (front of polynomial linked list)
	 * @return A new polynomial which is the product of the input polynomials - the returned node
	 *         is the front of the result polynomial
	 */
	private static float multiply_single_term(Node p1, Node p2){
		while(p1.next != null && p2.next != null){
			f
		}
	}
	public static Node multiply(Node poly1, Node poly2) {
		Node p1 = poly1;
		Node n = null;
		while(p1 != null){
			Node p2 = poly2;
			while(p2 != null){
				Node.
			}
		}
		
	    return null;	
	}
	
	/**
	 * Evaluates a polynomial at a given value.
	 * 
	 * @param poly Polynomial (front of linked list) to be evaluated
	 * @param x Value at which evaluation is to be done
	 * @return Value of polynomial p at x
	 */
	public static float evaluate(Node poly, float x) {

	    float sum = 0;
		float f  = (float) Math.pow(x, (double) poly.term.degree);
		f = f * poly.term.coeff;
		sum += f;
	
		for(Node current = poly.next ; current != null ;
		current = current.next) {
			float g  = (float) Math.pow(x, (double) current.term.degree);
			g = g * current.term.coeff;
			sum += g;
		}
		
	    return sum;
	}
	
	/**
	 * Returns string representation of a polynomial
	 * 
	 * @param poly Polynomial (front of linked list)
	 * @return String representation, in descending order of degrees
	 */
	public static String toString(Node poly) {
		if (poly == null) {
			return "0";
		} 
		
		String retval = poly.term.toString();
		for (Node current = poly.next ; current != null ;
		current = current.next) {
			retval = current.term.toString() + " + " + retval;
		}
		return retval;
	}	
	
	private static Node reverse(Node p) {
		Node ret=null;
		while (p != null) {
			ret = new Node(p.term.coeff, p.term.degree, ret);
			p = p.next;
		}
		return ret;
	}
}
