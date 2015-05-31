package LL;

import java.util.Stack;


public class LinkedList<T> {
private  Node<T> head;
//private Node<T>tail;

public Node<T> getHead() {
	return this.head;
}

public void setHead(Node<T> head) {
	this.head = head;
}
	 
public boolean ispalindrome(Node<T> head){
	//head = this.head;
	//check if the list is a palindrome
	Node<T> fast=head;
	Node<T> slow=head;
	Stack<T> stack = new Stack<T>();
	//push operation
	while(fast!=null&&fast.getNextNode()!=null){
		stack.push(slow.getData());
		slow = slow.getNextNode();
		fast = fast.getNextNode().getNextNode();
	}
	if(fast!=null){
	slow=slow.getNextNode();
	}
	while(slow!=null){
		int top = (int) stack.pop(); 
		if(top!=(int)slow.getData()){return false;}
		slow=slow.getNextNode();
	}
		return true;	
}
	public Node<T> nthNodeLinkedList(Node<T> head,int nthNode){
		
		Node<T> tempNode=head;
		Node<T> nNode=null;
		
		for (int count = 1; count < nthNode; count++) {
		if (tempNode!=null) {
			tempNode = tempNode.getNextNode();
			}	
		}
		while(tempNode!=null){
			
			if(nNode == null){
				nNode = head;
			}
			else{
				nNode = nNode.getNextNode();
				tempNode = tempNode.getNextNode();
			}
			if(nNode!=null){
				return nNode;
				}
		}
		return null;
	}
	
	public Node<T> nthRecursive(Node<T> head, int nthNode){
		int counter=0;
		if(head != null){
			 nthRecursive(head.getNextNode(), nthNode);
			 counter++;
		if (counter == nthNode) {
			return head;
			}
		
		}
		return null;
		
	}

public void addAtHead(T data){
//create a new node and make the head point to the 
	
	Node<T> newNode = new Node<T>(data);
	newNode.setNextNode(this.head);
	this.head = newNode;
}

/*public  void delDups(Node<T> node){
	if (node == null) return null;
	Node<T> curr = node;
	
	while(curr!=null){
		Node<T> runner = curr;
		while(runner.getNextNode()!=null){
			if(runner.getNextNode().getData()==curr.getData()){
				runner.setNextNode(runner.getNextNode().getNextNode());
			}
			else{
				runner.setNextNode(runner.getNextNode());
			}
		}
		
		curr= curr.getNextNode();
	}
	
}
*/


	public void createCircularList(T data){
		//create a new node and make the head point to the 
		
		this.addAtTail(data);
		Node<T> curr = new Node<T>(data);
		while(curr.getNextNode()!=null){
			curr = curr.getNextNode(); 
		}
		
		curr.setNextNode(this.head);
	}

	public boolean checkLoopLL(Node<T> head){
	Node<T>fast = head;
	Node<T>slow = head;
	
	while (fast.getNextNode()!=null && fast.getNextNode().getNextNode()!=null) {
		fast = fast.getNextNode().getNextNode();
		slow = slow.getNextNode();
		}
	if(fast == slow) return true;
	else {return false;}
	}

	public Node<T> getMiddleElement(Node<T> head){
		Node<T> slow = head,fast = head;
		int i = 0;
		System.out.println("IN middle elemnt loop");
		while (fast.getNextNode()!= null){
			System.out.println("IN middle  while elemnt loop - 2");
			if (i==0) {
				fast = fast.getNextNode();
			i = 1;
				System.out.println("IN middle while if elemnt loop - 2");		
				
			} else if (i==1) {
				fast = fast.getNextNode();
				slow = slow.getNextNode();
				i =0 ; 
				System.out.println("IN middle  while else if elemnt loop - 2");
			}
			
		}
	 return slow;
	}	
	
	
	

	public Node<Integer> mergeSortedLL(Node<T> a,Node<T> b){
		Node<Integer> result = null;
	if (a==null) return b;
	if (b==null) return a;
	if(a.getData() <= b.getData()){
		result = a;
		result.setNextNode(mergeSortedLL(a.getNextNode(),b));
	}
	
	else {
		result = b;
		result.setNextNode(mergeSortedLL(b.getNextNode(),a));
	}

	return result;
}
	
	
	
	public void addAtTail(T data){
	
	if(this.head==null){
		this.head=new Node<T>(data);
		return;
		}
	Node<T> newNode = new Node<T>(data);
	newNode.setNextNode(null);
	Node<T> curr = this.head;
	while(curr.getNextNode()!=null){
		curr = curr.getNextNode();
		}

	  curr.setNextNode(newNode);
	
	}
	
	
	
	

public void clear(){
	this.head=null;
}


public void addSorted(T data){
	Node<T> newNode = new Node<T>(data);
	if(this.head==null){
	this.head=newNode;
	return;
	}
  
Node<T> curr = this.head;
Node<T> prev=null;
while(curr!= null){
	if((int)newNode.getData() < (int)curr.getData()){
		if(prev!=null) {
			prev.setNextNode(newNode);
	        newNode.setNextNode(curr);  
	       return;
		}
		else{
			newNode.setNextNode(curr);
		    this.head = newNode;
		    return;
		    }
	}
		prev=curr;
		curr= curr.getNextNode();
	}
	if(curr==null) prev.setNextNode(newNode);
	}



public Node<T> deleteAtHead(){
	
	if(this.head==null)
		return null;
	
	Node<T> del = this.head;
	this.head=this.head.getNextNode();
	return del;
}

public Node<T> deleteAtTail(){
	if(this.head==null) return null;
	Node<T> curr = this.head;
	while(curr.getNextNode().getNextNode()!=null){
		curr = curr.getNextNode();	
	}
	curr.setNextNode(null);
	return curr;
}


 public Node<T> find(T data){
	 Node<T> curr = this.head;
	 while(curr != null){
		 if(curr.getClass().equals(data)){
		 return curr;
	 }
	 curr = curr.getNextNode();
	 }
	 return null;	 
 }
 public void reverseLL(Node<Integer> node){
	 //the idea is to copy the next node and set the curr.next to a node pointing back, 
	 // and then move the back pointer and the current
	 if(node == null) return ;
	 Node<T> curr = this.head;
	
	 Node<T> result = null;
	 while(curr!=null){
		 Node<T> next = curr.getNextNode();
		 curr.setNextNode(result);
		 result = curr;
		 curr = next;
		
	 }
	 this.head = result;
 }
 
	 public int length(){
		 if (head == null)
			 return 0;
	   int length = 0;
	   Node<T> curr = this.head;
	   while(curr != null){
		   length++;
		 curr= curr.getNextNode();   
	   	}
	   return length;
	   }

	 public Node<T> appendLL(Node<T> node1,Node<T> node2){
		 Node<T> current  = this.head;
	while(current.getNextNode()!=null){
		current=current.getNextNode();
		}	 
	 current.setNextNode(node2);
	 return current;
	}
	 public void ClearLL(Node<Integer> node){
	 //set the node to of the head to null
		 //not working
		 
		 this.head = null;
 	}
 
 @Override
 public String toString(){
	 
	 String res = "";
	 Node<T> curr = this.head;
	 
	 while(curr != null){
		 res += curr + ", ";
		 curr = curr.getNextNode();
		 
	 }
	 return res;
 }

public boolean isEmpty(){
	return(this.head==null);
		
}

}
