package Arrays;


public class sortedRecursionArray {
	
	public static void main(String[] args){
	int[] A = {2,3,4,5,6};
	System.out.println("in main");
	if (isArraySortedResursion(A,A.length-1) == 1)
		System.out.println("sorted");
	else
		System.out.println("unsorted");
	
	}
	
	public static int  isArraySortedResursion (int[] A,int index){
		
		if (index == 1) return 1;
		System.out.println("in method");
		return (A[index-1]<=A[index-2])?0:isArraySortedResursion(A, index-1);
		//System.out.println("in method - 2");
	}
	
}
