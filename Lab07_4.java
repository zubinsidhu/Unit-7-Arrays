
public class Lab07_4 {

	public static void main(String[] args) {
		double[] list = {1.9, 2.5, 3.7, 2.0, 1.0, 6.0, 3.0, 4.0, 5.0, 2.0};
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.print("\nMax: " + getMax(list) + "\nMin: " + getMin(list));
		System.out.printf("\nMean: %.2f", getMean(list));
		System.out.printf("\nDeviation: %.2f", getDev(list));
	}
	
	public static double getMax(double[] a) {
		double result = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > result) {
				result = a[i];
			}
		}
		return result;
	}
	
	public static double getMin(double[] a) {
		double result = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < result) {
				result = a[i];
			}
		}
		return result;
	}
	
	public static double getMean(double[] a) {
		double result = 0;
		for (double e: a) {
			result += e;
		}
		return result / (a.length);
	}
	
	public static double getDev(double[] a) {
		double result = 0;
		double mean = getMean(a);
		for (double e: a) {
			result += (e - mean) * (e - mean);
		}
		return Math.sqrt(result / (a.length - 1));
	}
}