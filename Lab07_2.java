//Count occurrences of numbers
import java.util.Scanner;
public class Lab07_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] counts = new int[100];
		int n;
		System.out.println("Enter numbers between 1 - 100. Input ends with 0: ");
		do {
			n = input.nextInt();
			if (n != 0) {
				counts[n - 1]++;
			}
		} while (n != 0);
		input.close();
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.println((i + 1) + " occurs " + counts[i] + " time(s)");
			}
		}
	}
}