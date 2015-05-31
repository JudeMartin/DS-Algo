package LL;

public class DDLLDEMO {
public static void main(String[] args) {
	DoublyLinkedList integers= new  DoublyLinkedList();
	integers.insertAthead(4);
	integers.insertAthead(14);
	integers.insertAthead(42);
	integers.insertAthead(34);
	integers.insertAthead(44);
	integers.insertAthead(54);
	integers.insertAthead(46);
	integers.insertAthead(64);
	integers.insertAthead(74);
	integers.insertAthead(84);
	System.out.println(integers.toString());
}
}
