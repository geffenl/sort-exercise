
public class Main {

	public static void main(String[] args) {
		try {
			if (Integer.parseInt(args[0]) >= 1950 && Integer.parseInt(args[0]) <= 2019) {
				int year = Integer.parseInt(args[0]);
				Quicksort sorter = new Quicksort();
			} else {
				System.out.println("Enter a year between 1950 and 2019.");
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}	
	}
	
}
