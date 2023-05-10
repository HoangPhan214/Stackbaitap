package stack.dev;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
	
	static void showpush(Stack st, int a) {
		st.push(new Integer(a));
		System.out.println("push(" + a +")");
		System.out.println("stack: " + st);
	}
	
	static void showpop(Stack st) {
		System.out.println("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: " + st);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		System.out.println("stack: " + st);
		showpush(st, 20);
		showpush(st, 40);
		showpush(st, 60);
		showpop(st);
		showpop(st);
		showpop(st);
		try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("stack trong");
		}
	}
}
