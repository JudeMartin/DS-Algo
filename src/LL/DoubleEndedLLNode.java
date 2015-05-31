package LL;

public class DoubleEndedLLNode<T> {
private T data;	
private DoubleEndedLLNode<T> prevNode;
private DoubleEndedLLNode<T> nextNode;

public DoubleEndedLLNode(T data){
	this.data=data;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}

public DoubleEndedLLNode<T> getPrevNode(){
	return prevNode;
}

public void setPrevNode(DoubleEndedLLNode<T> prevNode){
	 this.prevNode = prevNode;
}



public DoubleEndedLLNode<T> getNextNode(){
	return this.nextNode;
}
public void setNextNode(DoubleEndedLLNode<T> nextNode){
	this.nextNode = nextNode;
}

}


