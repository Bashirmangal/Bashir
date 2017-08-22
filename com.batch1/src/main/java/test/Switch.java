package test;

public class Switch {

	

	public static void main(String[] args) {
		

		
		 int color=1;// If i use char color=r; instead then the result will be this char (r).
		   switch(color){
		     case 1:
		     System.out.println("My favorite color is Red");
		     break;

		     case 2:
		     System.out.println("Blue");
		     break;

		     case 3:
		     System.out.println("Green");
		     break;

		     case 4:
		     System.out.println("Not RBG");
		     break;
		     default:
		     System.out.println("My favorite color is :"+ color);
		     break;
		 }
		}
		}


