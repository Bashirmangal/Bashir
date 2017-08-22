package day1;

public class OneTo100H {

	public static void main(String[] args) {

		int sum = 0;  // 1 to 100 adding, 1+2=3+3=6+4=10 and going on up to 100 that the result is 5050
		for (int i = 1; i <= 100; i++)
			sum =sum+ i;
		System.out.println("The sum is =" + sum);
	}

	/*
	 * for( int i = 1; i <= 100; i++){ if( i < 2){ System.out.print(i ); } else
	 * if ( i < 100){ System.out.print("+" + i );
	 * 
	 */

}
