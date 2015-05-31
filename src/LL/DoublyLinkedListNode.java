package LL;

public class DoublyLinkedListNode {

	private int data;
	private DoublyLinkedListNode nextNode;
	private DoublyLinkedListNode previousNode;
	
	public DoublyLinkedListNode(int data){
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyLinkedListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoublyLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	public DoublyLinkedListNode getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(DoublyLinkedListNode previousNode) {
		this.previousNode = previousNode;
	}
	
	
}