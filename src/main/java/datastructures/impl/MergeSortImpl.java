package datastructures.impl;

public class MergeSortImpl {
	
	private int[] helperArray;
	private int[] outputArray;
	
	public static void main(String[] args) {
		MergeSortImpl mergeSort = new MergeSortImpl();
		
		mergeSort.sort(new int[]{43,32,30,23,25,20,18,15,10});
	}

	private void sort(int[] inputArray) {
		this.outputArray = inputArray;
		int size = inputArray.length;
		this.helperArray = new int[size];
		mergeSort(0, size-1);
		for(int e : outputArray) {
			System.out.println(e);
		}
	}

	private void mergeSort(int low, int high) {
		//check if low is smaller than high. if not , no sorting
		if(low<high) {
			//get the middle index of array
			int mid = low + (high - low)/2;
			
			//sort left side of the array
			mergeSort(low, mid);
			
			//sort right side of the array
			mergeSort(mid+1, high);
			
			//combine the sub arrays	
			merge(low, mid, high);
		}
		
	}

	private void merge(int low, int mid, int high) {
		
		//copy the initial output array to helperArray
		for(int i=low; i<= high; i++){
			helperArray[i] = outputArray[i];
		}
		int i=low;
		int j = mid + 1;
		int k = low;
		
		//copy the smallest values to the actual outputArray
		while(i<=mid && j<= high) {
			//from left side sub array
			if(helperArray[i] <= helperArray[j]) {
				outputArray[k] = helperArray[i];
				i++;
			} 
			//from right side sub array
			else {
				outputArray[k] = helperArray[j];
				j++;
			}
			k++;
		}
		
		// Copy the rest of the left side of the array into the target array
		while(i<=mid) {
			outputArray[k] = helperArray[i];
			k++;
			i++;
		}
		
	}

}
