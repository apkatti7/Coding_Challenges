package interview_coding;

public class Missing_element_inarray {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,7};
		int expelements =a.length +1;
		int totalsum = expelements * (expelements+1)/2;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.print("Missing no in an Array is :");
		System.out.println(totalsum - sum);
 
	}

}
