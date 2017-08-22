package day1;

public class OneToHundredMultiplication {
	
	// it is both multiplication and adding in the same time from 1 to 100
	public static void main(String[]args){
		
		int sum=0;   // 1 to 100 adding, 1+2=3+3=6+4=10 and going on up to 100 that the result is 5050
		double total=1;
		for(int i=1;i<=100;i++){
			sum=i+sum;
			total= total*i;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Multiplication is: "+total);
		
		}
		
		
		
	}	


