package Stacks;

public class DynamicArray {
	int size;
	int top;
	int [] array;
	public DynamicArray(){
		size = 1;
		top = -1;
		array = new int[size]; 
	}
	public void push(int data){
		if (isFull()) {
			doubleStack();
		}
		 array[++top] = data;
	}
	public int pop(){
		if (isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			return array[top--];
		}
		return 0;
	}
	public int peek(){
		if (isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			return array[top];
		}
		return 0;
		
	}
	public void clear(){
		top = -1;
	}
	public boolean isFull(){
		return (top == size-1);
	}
	public boolean isEmpty(){
		return(top == -1);
	}
	public void doubleStack(){
		int[] newArray = new int[size*2];
		System.arraycopy(array, 0, newArray, 0, size);
		size = size * 2;
		array = newArray;
		
	}
	public static void main(String[] args) {
		DynamicArray obj = new DynamicArray();
		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());
		System.out.println(obj.size);
		obj.push(2);
		obj.push(3);
		System.out.println(obj.size);
		obj.push(5);
		obj.push(4);
		System.out.println(obj.size);
		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());
		
	}
}
