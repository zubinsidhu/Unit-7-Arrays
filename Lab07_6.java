public class Lab07_6 {

	public static void main(String[] args) {
		double[] list = {1.1, -2.8, 5.6, 3.8, -9.1, 8.2, 6.9, 10.0, -4.7, 7.1};
		System.out.print("Before Bubble Sort: \n");
		for (double e: list) {
			System.out.print(e + " ");
		}
		System.out.print("\nAfter Bubble Sort: \n");
		bubbleSort(list);
		for (double e: list) {
			System.out.print(e + " ");
		}
		if (isSorted(list)) {
			System.out.print("\nList Sorted");
		}
	}
	public static void bubbleSort(double[] a) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					double temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped == true);
	}
	public static boolean isSorted(double[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}