
public class CopyingArraysLoopStyle {

	public static void main(String[] args) {
		int[] source = {2, 3, 1, 5, 10};
		// create a target array with the same length of the source array
		int[] target = new int[source.length];
		// Copy each element using a loop
		for (int i = 0; i < source.length; i++) {
		   target[i] = source[i];
		}
		for (int e: target) System.out.print(e + " ");
	}

}
