package interview_coding;

public class Wap_Duplicate_Array {

	public static void main(String[] args) {
		int[] array = { 3, 4, 5, 2, 6, 7, 8, 5, 4, 6, 8 };
		System.out.println("Duplicate Elements are :");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					System.out.println(array[j] + "");
				}
			}

		}
	}
}
