
public class OccurrenceInArray {

	public static void main(String[] args) {
		char[] myLetters = createArray(100);
		printArray(myLetters);
		int[] counts = countChar(myLetters);
		displayCounts(counts);
	}
	
	public static char[] createArray(int size) {
		char[] letters = new char[size];
		for (int i = 0; i < size; i++) {
			letters[i] = (char)('a' + (int)(Math.random() * ('z' - 'a' + 1)));
		}
		return letters;
	}
	
	public static void printArray(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if ((i + 1) % 20 == 0) {
				System.out.print(a[i] + "\n");
			}
			else {
				System.out.print(a[i] + " ");
			}
		}
	}
	
	public static int[] countChar(char[] a) {
		int[] result = new int['z' - 'a' + 1];
		for (int i = 0; i < a.length; i++) {
		       result[a[i] - 'a']++;
		   }
		return result;
	}
	
	public static void displayCounts(int[] a) { System.out.println("Occurrences of each characters:"); 
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) % 5 == 0 ? a[i] + " of " + (char)('a' + i) + "\n" : a[i] + " of " + (char)('a' + i) + "; ");
		} 
	}

}
