package BST;
public class BSTTree {
	private Integer data;
	private BSTTree leftChild;
	private BSTTree rightChild;

	public BSTTree(Integer data) {
		this.data = data;
	}
	public static BSTTree addSorted(int[] data, int start, int end) {
		if (end >= start) {
			int mid = (start+end)/2;
			BSTTree newNode = new BSTTree(data[mid]);
			newNode.leftChild = addSorted(data, start, mid-1);
			newNode.rightChild = addSorted(data, mid+1, end);
			return newNode;
		}
		return null;
	}
	
	public int height() {
		if (isLeaf()) return 1;
		int left = 0;
		int right = 0;
		if (this.leftChild != null)
			left = this.leftChild.height();
		if (this.rightChild != null)
			right = this.rightChild.height();
		return (left > right) ? (left + 1) : (right + 1);
	}
	
	public int numOfLeafNodes() {
		if (isLeaf()) return 1;
		int leftLeaves = 0;
		int rightLeaves = 0;
		if (this.leftChild != null)
			leftLeaves = leftChild.numOfLeafNodes();
		if (this.rightChild != null)
			rightLeaves = rightChild.numOfLeafNodes();
		return leftLeaves + rightLeaves;
	}
	
	public boolean isLeaf() {
		return this.leftChild == null && this.rightChild == null;
	}

	public void traverseInOrder() {
		if (this.leftChild != null)
			this.leftChild.traverseInOrder();
		System.out.print(this + " ");
		if (this.rightChild != null)
			this.rightChild.traverseInOrder();
	}

	public BSTTree find(Integer data) {
		if (this.data == data)
			return this;
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		if (rightChild != null)
			return rightChild.find(data);
		return null;
	}

	public void insert(Integer data) {
		if (data >= this.data) { // insert in right subtree
			if (this.rightChild == null)
				this.rightChild = new BSTTree(data);
			else
				this.rightChild.insert(data);
		} else { // insert in left subtree
			if (this.leftChild == null)
				this.leftChild = new BSTTree(data);
			else
				this.leftChild.insert(data);
		}
	}

	public Integer largest() {
		if (this.rightChild == null)
			return this.data;
		return this.rightChild.largest();
	}

	public Integer smallest() {
		if (this.leftChild == null)
			return this.data;
		return this.leftChild.smallest();
	}

	public Integer getData() {
		return data;
	}

	public BSTTree getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BSTTree left) {
		this.leftChild = left;
	}

	public BSTTree getRightChild() {
		return rightChild;
	}

	public void setRightChild(BSTTree right) {
		this.rightChild = right;
	}

	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}
