package stack.dev;

import java.util.Stack;

public class Baitap {
	static void stack_push(Stack<Integer> stack) {
		for(int i = 0; i < 6; i++) {
			stack.push(i);
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop operation: ");
		for (int i = 0; i < 6; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}
	
	static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Cac phan tu co trong stack: " + element);
	}
	
	static void stack_search(Stack<Integer> stack, int element) {
		Integer ui = (Integer) stack.search(element);
		if(ui == -1)
			System.out.println("phan tu khong tim thay");
		else
			System.out.println("phan tu tim duoc o vi tri: " + ui);
	}
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_pop(stack);
		stack_search(stack, 2);
		stack_search(stack, 4);
		stack_search(stack, 3);
	}	
}
