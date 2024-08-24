
public class CopyingArraysMethodStyle {
	
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		System.out.println("Before alterArray method list: ");
		printArray(list);
		alterArray(list);
		System.out.println("\nAfter alterArray method list: ");
		printArray(list);
	}
	
	public static void alterArray(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		a[0] = 100;
		a[a.length - 1] = 200;
		System.out.println("\nInside of alterArray method a: ");
		printArray(a);
		System.out.println("\nInside of alterArray method result: ");
		printArray(result);
	}
	
	public static void printArray(int[] a) {
		System.out.print("print array: ");
		for (int e: a) System.out.print(e + " ");
	}
	
}