
public class Main {

	public static void main(String[] args) {
		int a[] = {-1, 2, -3, 4, -5, 6, -7, 8, -9};
		
		Quicksort sorter = new Quicksort();
		sorter.quicksort(a, 0, a.length-1);
		
		for(int i: a) {
			System.out.print(i + " ");
		}
	}

}
