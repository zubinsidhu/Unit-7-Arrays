//Assign Grades Lab
import java.util.Scanner;
public class Lab07_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = input.nextInt();
		double[] scores = new double[size];
		double best = scores[0];
		System.out.print("Enter scores: ");
		for (int i = 0; i < size; i++) {
			scores[i] = input.nextDouble();
			if (scores[i] > best) best = scores[i];
		}
		input.close();
		char grade;
		for (int i = 0; i < size; i++) {
			if (scores[i] >= (best - 10)) {
				grade = 'A';
			}
			else if (scores[i] >= (best - 20)) {
				grade = 'B';
			}
			else if (scores[i] >= (best - 30)) {
				grade = 'C';
			}
			else if (scores[i] >= (best - 40)) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("Student" + i + ": score " + scores[i] + "; grade " + grade);
		}
		
	}
}