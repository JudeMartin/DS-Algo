package Sorting;


public class MergeSort {	
	public static void mergesort(int[] array){
		int helper[] = new int[array.length];
		mergesort(array, helper , 0, array.length-1);
		}
	public static void mergesort(int[] array,int[] helper,int low,int high ){
	 //if(low == high)
		// return;
	if(low<high){
			int mid =low+(high-low)/2;
			mergesort(array, helper, low, mid);//left half
			mergesort(array, helper, mid+1, high);//right half
			merge(array,helper,low,high);//merge
			}
		}
	
	public static void merge(int[] array, int[] helper, int low,int high) {
		int mid = low+(high-low)/2;
	for(int i = 0 ; i <=high; i++){
		helper[i] = array[i];//copy to helper
		}	
	int helperLeft = low;
	int helperRight = mid+1;
	int current = low;
	while(helperLeft <= mid && helperRight <= high){
	 if(helper[helperLeft] < helper[helperRight]){
			array[current] = helper[helperLeft];
			helperLeft++;
		 }else {
		 	array[current] = helper[helperRight];
		 	helperRight++;
	 		}
		 current++; 
	}
	int remaining = mid - helperLeft;
	for(int i=0;i<=remaining;i++){
		array[current + i] = helper[helperLeft + i];
		}
	
		
	}

	public static void printAll(int[] a){
		for(int arr : a){
			System.out.print(arr+" ");
			
		}System.out.println("");
	}
	
	public static void main(String[] args) {
	int[] a= {73,6,2,3,9,8,77,1,2,4,6,91,2,88,9,0,99999,1};
		printAll(a);//Print elements in non sorted order
		mergesort(a);//sort the elements
		printAll(a);//Print elements in sorted order
	}
}
