package Sorting;
public class QuickSort{
	
	public static void quickSort(int[] A, int start,int end){
		if(start<end){
			int partitionIndex=randomPartition(A, start, end);//partition(A, start, end);
			quickSort(A, start,partitionIndex-1);
			quickSort(A,partitionIndex+1,end);
		}
	}
	public static int partition(int[] A, int start, int end){
		int pivot=A[end];//compare the pivot and A[i] and swap with the pIndex
		int partitionIndex=start;
		for (int i = start; i < end; i++) {
			if(A[i]<=pivot){
				//swap(A[i], A[partitionIndex]);
				
				int temp = A[i];
				A[i]=A[partitionIndex];
				A[partitionIndex]=temp;
				partitionIndex++;
				
			}
		}		
		//swap(A[partitionIndex], A[end]);
		int temp=A[partitionIndex];
		A[partitionIndex]=A[end];
		A[end]=temp;
		
		return partitionIndex;
	}
	public static void swap(int a, int b){
		a=a^b;
		b=a^b;
		a=a^b;
	}
	
	public static int getRandomInteger(int maximum, int minimum){//generate the random number and swap with the end 
		return ((int) (Math.random()*(maximum - minimum))) + minimum;//therefore makes it the nlogn alog.
		}
	
	public static int randomPartition(int[] A, int start,int end){
		int pivotIndex = getRandomInteger(end, start);
		int temp = A[pivotIndex];
		A[pivotIndex]=A[end];
		A[end]=temp;
		return partition(A, start, end);
	}
	
	public static void printAll(int[] a){
		for(int arr : a){
			System.out.print(arr+" ");
			
		}System.out.println("");
	}
	public static void main(String[] args) {
		int[] A={100,2,3,4,5,6,7,5,42,0,9,1};
		System.out.print("the elements before sorting: ");printAll(A);
		quickSort(A, 0, A.length-1);
		System.out.print("the elements after sorting: ");printAll(A);
	}
}