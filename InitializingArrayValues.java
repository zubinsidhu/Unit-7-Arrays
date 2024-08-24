import java.util.Scanner;
public class InitializingArrayValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		//System.out.print("Enter the values: ");
		int[] list = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			list[i] = (int)(Math.random() * 100);
			System.out.print(list[i] + " ");
			sum += list[i];
		}
		int max = list[0];
		for (int i = 0; i < size; i++) {
			if (list[i] > max) max = list[i];
		}
		int min = list[0];
		for (int i = 0; i < size; i++) {
			if (list[i] < min) min = list[i];
		}
		System.out.print("\nLargest value: " + max + "\nSmallest value: " + min);
		int average = sum/size;
		System.out.println("\nSum: " + sum + "\nAverage: " + average);
		//Random shuffling of the values but not with itself
		for (int i = list.length - 1; i > 0; i--) {
			int idx = (int)(Math.random() * 1); 
			int temp = list[i];
			list[i] = list[idx];
			list[idx] = temp;
		}
		System.out.print("List shuffled: ");
		for (int i: list) {
			System.out.print(i + " ");
		}
		//Shifting the elements right
		int temp = list[list.length - 1];
		for (int i = list.length - 1; i > 0; i--) {
			list[i] = list[i - 1];
		}
		list[0] = temp;
		System.out.print("\nList shifted: ");
		for (int i: list) {
			System.out.print(i + " ");
		}
		input.close();
	}
}