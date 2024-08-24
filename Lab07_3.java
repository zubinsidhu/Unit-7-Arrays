//Print Distinct Numbers
import java.util.Scanner;
public class Lab07_3 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			int n = input.nextInt();
			boolean isInNumbers = false;
			for (int j = 0; j < count; j++) {
				if (n == numbers[j]) {
					isInNumbers = true;
				}
			}
			if (!isInNumbers) {
				numbers[count] = n;
				count++;
			}
		}
		input.close();
		System.out.print("The number of distint numbers: " + count + "\nThe distinct numbers: ");
		for (int i = 0; i < count; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}