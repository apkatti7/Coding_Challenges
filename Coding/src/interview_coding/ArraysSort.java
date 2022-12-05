package interview_coding;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int [] array = {2,3,1,4,5,8,7,6};
		Arrays.sort(array);
		for(int i=0; i<=array.length -1;i++) {
			System.out.println(array[i]);
		}

	}

}
