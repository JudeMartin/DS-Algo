package LL;

public class DoublyLinkedList {
  private DoublyLinkedListNode head;
  
  void insertAthead(int data){
	  DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
	  newNode.setNextNode(this.head);
	  if (this.head!=null){
		  //newNode= this.head.getPreviousNode();
		  this.head.setPreviousNode(newNode);
		  
	  }
	  this.head = newNode;
	  
  }
/*
  public String toString(){

  return str;
  }
  */
}
