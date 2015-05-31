	package Stacks;
	import LL.*;
	public class LLArray {
		//LinkedList<Integer> arrayLL;
		private LinkedList<Integer> arrayLL;
		LLArray(){
			this.arrayLL =new LinkedList<Integer>();
		}
		public void push(int data){
			arrayLL.addAtHead(data);
		}
		public void pop()
		{
			arrayLL.deleteAtHead();
		}
		public void peek(){
			System.out.println(arrayLL.getHead());
		}
		public void clear(){
			arrayLL.setHead(null);
			
		}
		public void display(){
			System.out.println(arrayLL.toString());
		} 
		
		public static void main(String[] args) {
			LLArray obj = new LLArray();
			obj.peek();
			obj.push(3);
			obj.push(4);
			obj.push(5);
			obj.peek();
			obj.display();
		}
	}
