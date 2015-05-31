package Searching;
//The array of integers must be always sorted in the Binary Search.
public class binarySearch {
	public static int binarySearchRecursive(int a[],int x){
		return binarySearchRecursive(a,x,0,a.length-1);
	}
	public static int binarySearchRecursive(int a[],int x , int low,int high){
		if(low > high) return -1;
		
		int mid = low+(high-low)/2;//high-(high-low)/2
		if(x < a[mid]){
			return binarySearchRecursive(a, x, low, mid);
			}
			else if(x > a[mid]){
			return binarySearchRecursive(a, x, mid+1, high);
			}
			else{
			return mid;
			}
		
		
		
	}
	public static void main(String[] args) {
		
		int[] a={1,3,4,5,6,7,8,9,24,76,999}; 
		int key= 999;
		System.out.println("At the location: "+binarySearchRecursive(a,key));
	}
	
}
