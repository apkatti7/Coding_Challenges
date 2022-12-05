package coding;

public class Min_array {
	public static void main(String[] args) {
		int[] a = { 4, 3, 5, 2, 1, 6 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
