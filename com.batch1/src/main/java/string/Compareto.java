package string;

public class Compareto {

	public static void main(java.lang.String[] args) {
		 // String class equals () method executed and return boolean (True & False) 
		  
		String s1= "ratan";
		String s2="anu";
		String s3="ratan";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));
		System.out.println("Ratan".equals("ratan"));// ratan as a string or s1 is also work
		System.out.println("Ratan".equalsIgnoreCase(s1));
		
		
		// Compareto ---------> return +value or -value
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
		System.out.println("Ratan".compareTo("ratan"));// ratan or s1 also work as shown here
		System.out.println("Ratan".compareToIgnoreCase(s1));

}


	}


