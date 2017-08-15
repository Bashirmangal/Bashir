package day1;

public class ForLoop {
	
	public static void main(String[] args) {

		int sum = 0; // here loop give us 1+2+3+4 up to 11's total 66

		for (int a = 1; a <= 11; a++) {

			sum = a + sum;

			

		}
		System.out.println("your total is ="+sum);

	}
}


