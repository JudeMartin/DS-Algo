package DoubleLL;

public class DLLNode {
	private DLLNode next;
	private DLLNode previous;
	private int data;
	public DLLNode getNext() {
		return next;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public DLLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
