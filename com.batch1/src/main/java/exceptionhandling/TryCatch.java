package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {   // simple example of Exception handlingj
		 System.out.println("ratan");
		 
		 try {
		 System.out.println(10/0);
		 }
			 
		 
         catch (ArithmeticException ae){
        	 System.out.println(10/2);
        	 
         }
         System.out.println("rest of the code");
	
		 }
}

