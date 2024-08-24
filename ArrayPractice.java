public class ArrayPractice {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		int[] reverseList = reverse(list);
		System.out.println("After reverse: ");
		printArray(reverseList);
		System.out.println("\nAfter reverse, original array: ");
		printArray(list);
		alterArray(list);
		System.out.println("\nAfter alter, original array: ");
		printArray(list);
	}
	
	public static void printArray(int[] a) {
		for (int e: a) System.out.print(e + " ");
		System.out.println();
	}
	
	public static int[] reverse(int[] a) {
		int[] result = new int[a.length];
		int idx = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result[idx] = a[i]; 
			idx++;
		}
		a = result;
		return a;
	}
	
	public static void alterArray(int[] a) {
		a[0] = 100;
		a[a.length - 1] = 200;
	}
}