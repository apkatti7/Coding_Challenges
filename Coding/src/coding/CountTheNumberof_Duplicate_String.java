package coding;

public class CountTheNumberof_Duplicate_String {

	public static void main(String[] args) {
		String s = "Beautiful Beach";
		System.out.println("The duplicate elements are:");
		char[] carray = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if((carray[i]==carray[j]) ) {
					System.out.println(carray[j] + " ");
				}
			}
		}

	}

}
