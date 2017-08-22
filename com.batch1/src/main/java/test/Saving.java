package test;

public class Saving extends Account {// if i want to call both i have to creat object for this class too.
	
	void deposit(int a){
	//	if(a>500);
		//amount=amount+a+5;
		super.deposit(a);
			
	}
	
	public static void main(String[]args){
		Saving s=new Saving();
		s.deposit(1000);
		System.out.println(s.amount);
		
	}

}
