import java.util.Scanner;
public class SortingArrays {
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i = 0; i < size; i++) {
			list[i] = (int)(Math.random() * 100);
		}
		printing(list);
		input.close();
	}
	//prints the array given
	public static void printArray(int[] a) {
		for (int e: a) System.out.print(e + " ");
		System.out.println();
	}
	//sorts the values in the array in increasing order
	public static void selectionSort(int[] a) { 
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int minIdx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) { 
					min = a[j];
					minIdx = j;
				} 
			}
			if (minIdx != i) { 
				int temp = a[i];
				a[i] = min;
			    a[minIdx] = temp;
			}
		}
	}
	//searches the sorted array for the key value's index
	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (key > a[mid])
				low = mid + 1; 
			else if (key == a[mid]) 
				return mid; 
			else high = mid - 1;
		}
		return -low - 1;
	}
	//prints the original array and the sorted array
	public static void printing(int[] list) {
		System.out.println("Original Array: ");
		printArray(list);
		System.out.println("Sorted Array: ");
		selectionSort(list);
		printArray(list);
		System.out.println("\nSearching 15: " + binarySearch(list, 15));
	}
}