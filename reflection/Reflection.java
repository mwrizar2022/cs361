/**
 * 
 */
package reflection;

/**
 * @author ADD YOUR NAME : Matthew Wrizar
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
	
		
		
		
		System.out.println("Inheritance Chain: ");
		
	Class<?> clazz = o.getClass();
	while (clazz!=null) {
		System.out.println("");
		System.out.println(clazz);
		clazz=clazz.getSuperclass();
	}
		
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\n");
		
		for (Method method: m) {
			System.out.print(method);
			System.out.print(",");
		}
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String c = "Matthew";
		r.inheritanceChain(c);
		r.listMethods(c);
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		
		ColoredCircle d = new ColoredCircle();
		
		r.inheritanceChain(d);
		r.listMethods(d);
	}

}
