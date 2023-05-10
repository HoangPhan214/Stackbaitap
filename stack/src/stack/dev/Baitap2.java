package stack.dev;

public class Baitap2 {
	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public Baitap2(int size) {
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = -1;
	}
	
	public void push(int entry) throws Exception {
		if(this.isStackFull()) {
			System.out.println("Stack day");
		this.increaseStackCapacity();
		}
		System.out.println("Them: " + entry);
	}
	
	public int pop() throws Exception {
		if(this.isStackEmpty()) {
			System.out.println("Stack tran.");
		}
		int entry = this.stackArray[top--];
		System.out.println("Xoa muc nhap: " + entry);
		return entry;
	}
	
	public int peek() {
		return stackArray[top--];
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	public boolean isStackFull() {
		return(top == stackSize - 1);
	}
	
	public void increaseStackCapacity() {
		int[] newStack = new int[this.stackSize*2];
		for(int i = 0; 1 < stackSize; i++) {
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize*2;
	}
	
	public static void main(String args[]){
		Baitap2 stack = new Baitap2(3);
		try {
			for(int i=1;i<10;i++){
			    stack.push(i);
			}
			for(int i=1;i<4;i++){
				 stack.pop();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
