/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME: Matthew Wrizar
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		
		//stack: last in first out.
		//queue : first in first out.
		

		if (theStack==null) {
			return null;
			
		}
		
		MyNode<T> next =theStack.next;
		T curr = theStack.val;
		theStack=next;
		return curr;
	
	}

	public void push(T v) {
		// TODO To complete
		
		MyNode<T> currNode= new MyNode(v, theStack);
		theStack=currNode;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		
		Person p1 = new Person ("Matthew", "Wrizar");
		
		Person p2=new Person("Professor", "Scharff");
		MyStack<Person> personStack = new MyStack<Person>();
		personStack.push(p1);
		personStack.push(p2);
	}

}
