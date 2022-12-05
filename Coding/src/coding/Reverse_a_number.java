package coding;

public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 987654,remainder, reverse = 0;
		while (number != 0) {
			 remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}
}
