import java.util.Scanner;
public class Lab07_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		String[] names = new String[numOfStudents];
		double[] scores = new double[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) {
			System.out.print("Enter the student's name: ");
			names[i] = input.next();
			System.out.print("Enter the student's scores: ");
			scores[i] = input.nextDouble();
		}
		input.close();
		for (int i = 0; i < numOfStudents; i++) {
			for (int j = i + 1; j < numOfStudents; j++) {
				if (scores[j] > scores[i]) {
					double temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
					String tempStr = names[i];
					names[i] = names[j];
					names[j] = tempStr;
				}
			}
		}
		System.out.println("------------------------\nGradebook Record\n");
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("name: " + names[i] + "\tscore: " + scores[i]);
		}
	}
}