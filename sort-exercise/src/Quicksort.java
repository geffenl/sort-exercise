
public class Quicksort {
	
	/*
	 * Gets the index on which to split the array in half.
	 * All partitioning happens in the division step, so
	 * it simply recursively calls quicksort on both halves
	 * of the current array
	*/
	public void quicksort(int a[], int first, int last) {
		if (first < last) {
			int pivotIndex = partition(a, first, last);
			quicksort(a, first, pivotIndex-1);
			quicksort(a, pivotIndex+1, last);
		}
	}
	
	/*
	 * The partitioning function used in quicksort -
	 * Chooses the last number in the array as a pivot
	 * point and iterates through the array, partitioning
	 * the numbers such that all those smaller than the
	 * pivot are to its left and all those greater are to
	 * its right
	 */
	private int partition(int a[], int first, int last) {
		int pivot = a[last];
		int currentIndex = first;
		for (int i = first; i < last; i++) {
			if (a[i] <= pivot) {
				int temp = a[currentIndex];
				a[currentIndex] = a[i];
				a[i] = temp;
				currentIndex++;
			}
		}
		int temp = a[currentIndex];
		a[currentIndex] = a[last];
		a[last] = temp;
		return currentIndex;
	}

}
