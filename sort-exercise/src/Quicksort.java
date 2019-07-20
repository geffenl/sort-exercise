
public class Quicksort {
	
	public void quicksort(int a[], int first, int last) {
		if (first < last) {
			int pivotIndex = partition(a, first, last);
			quicksort(a, first, pivotIndex-1);
			quicksort(a, pivotIndex+1, last);
		}
	}
	
	private int partition(int a[], int first, int last) {
		int pivot = a[last];
		int currentIndex = first;
		for (int i = first; i < last; i ++) {
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
