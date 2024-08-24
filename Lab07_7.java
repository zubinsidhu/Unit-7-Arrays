public class Lab07_7 {

	public static void main(String[] args) {
		int size1 = (int)(Math.random() * 10 + 3);
		int[] list1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			list1[i] = (int)(Math.random() * 11);
		}
		int size2 = (int)(Math.random() * 10 + 5);
		int[] list2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			list2[i] = (int)(Math.random() * 11);
		}
		selectionSort(list1);
		selectionSort(list2);
		for (int e: list1) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (int e: list2) {
			System.out.print(e + " ");
		}
		System.out.println();
		int[] mArray = merge(list1, list2);
		for (int e: mArray) {
			System.out.print(e + " ");
		}
	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, idx = 0;
		while (i < a.length && j < b.length) {
			result[idx++] = a[i] < b[j] ? a[i++] : b[j++];
		}
		while (i < a.length) {
			result[idx++] = a[i++];
		}
		while (j < b.length) {
			result[idx++] = b[j++];
		}
		return result;
	}
	
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
}