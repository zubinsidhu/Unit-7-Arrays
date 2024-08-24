import java.util.Scanner;
public class AnalyzingNumbersArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int size = input.nextInt();
		double[] list = new double[size];
		System.out.print("Enter the values of elements: ");
		double sum = 0;
		for (int i = 0; i < size; i++) {
			list[i] = input.nextDouble();
			sum += list[i];
		}
		input.close();
		double avg = sum / size;
		int count = 0;
		for (double e: list) {
			if (e > avg) count++;
		}
		System.out.println("Sum: " + sum + "\nAverage: " + avg + "\nNumber of elements above average: " + count);
	}

}
