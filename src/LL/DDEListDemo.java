package LL;


public class DDEListDemo {
public static void main(String[] args) {
	DoubleEndedLinkedList Dll = new DoubleEndedLinkedList();
	
	
	//Dll.insertAtTail(113);
	Dll.insertAtTail(1515);
	Dll.insertAtTail(1514);
	Dll.insertAtTail(1513);
	Dll.insertAtTail(1512);
	Dll.insertAtTail(1511);
	Dll.insertAtHead(1510);
	System.out.println(Dll.deleteAtTail());
	System.out.println(Dll);
	
	}
}
