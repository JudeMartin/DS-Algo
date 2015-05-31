package LL;


public class DoubleEndedLinkedList { 
	private Node<Integer> head;
	private Node<Integer> tail;
	
	
	
	public void insertAtHead(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	
	
	
	public void insertAtTail(int data){
		Node<Integer> newNode = new Node<Integer>(data);
		if(this.head == null){
		this.head = newNode;
		this.tail = newNode;
		}
		else{
			this.tail.setNextNode(newNode);
			this.tail = newNode;
			
		}
		 
	}
	
	public Node<Integer> deleteAtTail(){
		Node<Integer> newNode =this.tail;
		if(this.tail!=null){
		this.tail = newNode;
		}
 		return newNode;
		
	}


public String toString(){
	String result ="{";
	Node<Integer> current = this.head;
	while(current != null){
		result+=current.toString()+", ";
		current=current.getNextNode();
		
	}
	result+="}";
	return result;
}

}
