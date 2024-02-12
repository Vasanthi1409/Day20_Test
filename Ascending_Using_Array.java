package Day20_Test.org;

public class Ascending_Using_Array {

	public static void main(String[] args) {
		int arr[] = { 50, 30, 10, 60, 40 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int swapval = arr[i];
					arr[i] = arr[j];
					arr[j] = swapval;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
