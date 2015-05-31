package Stacks;

public class ArrayStack {
	private int size;
	private int top;
	private int[] array;
	
	public ArrayStack(){
	top = -1;
	size = 10;
	array = new int[size];
	}
	public  boolean isEmpty(){
		return (top == - 1);
	}
	
	public  boolean isFull(){
		return (top == size-1);
	}
	
	public void push(int data) {
		
		if (isFull()){
			System.out.println("Stack overFlow");
		}
		else{
			
			array[++top] = data;
			System.out.println("The Value : "+ data + " is pushed to the stack ");
		}
		
	}
	
	public int peek(){
		
		if (isEmpty()) {
			System.out.println("Stack underflow");
			
		} 
		else {
			return array[top];
		}
		return 0;
	}
	
	public int pop(){
		if (isEmpty()) {
			System.out.println("Invalid operation");
		} else {System.out.println(top);
				return array[top--];
		}
		return  0;
	}
	
	public void clear(){
	 top = -1;	
	}
	public static void main(String[] args) {
		ArrayStack obj = new ArrayStack();
		obj.push(5);
		obj.push(50);
		System.out.println("The top element: "+obj.peek());
		obj.clear();
		System.out.println(obj.isEmpty() ? true:false);
		System.out.println(obj.isFull() ? true:false);
	}	
}
