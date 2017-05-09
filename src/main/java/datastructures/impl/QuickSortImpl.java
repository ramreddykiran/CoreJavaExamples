package datastructures.impl;

public class QuickSortImpl {
	
	private int[] outputArray;
	
	public static void main(String[] args) {
		QuickSortImpl quickSort = new QuickSortImpl();
		quickSort.sort(new int[]{43,32,30,23,25,20,18,15,10});
	}

	private void sort(int[] inputArray) {
		this.outputArray = inputArray;
		int size = inputArray.length;
		quickSort(0, size-1);
		for(int e:outputArray){
			System.out.println(e);
		}
	}

	private void quickSort(int low, int high) {
		int i = low;
		int j = high;
		
		//get pivot element as middle element of the array
		int pivot = outputArray[low + (high - low)/2];	
		
		//divide array into 2 sub arrays
		while(i<=j) {

			//move i position to right until the element at i position is greater than pivot element.
			// (or) if the current value from left array is smaller than pivot element, move to next element from left to right
			while(outputArray[i] < pivot){
				i++;
			}
			
			//move j position to left until the element at j position is less than pivot element 
			// (or) if the current value from right array is larger than pivot element, move to next element from right to left
			while(outputArray[j] > pivot){
				j--;
			}
			
			//if i did not cross j, then swap elements at i and j positions
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		//recursion
		if(low<j) {
			quickSort(low,j);
		} 
		if(i<high) {
			quickSort(i,high);
		}
		
	}

	private void exchange(int i, int j) {
		int temp = outputArray[i];
		outputArray[i] = outputArray[j];
		outputArray[j] = temp;
	}

}
