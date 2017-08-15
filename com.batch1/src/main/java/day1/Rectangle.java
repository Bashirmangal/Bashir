package day1;

public class Rectangle {
	
	int len;
	int breath;
	
	
	void area()
	{
		System.out.println("Breath of the Rectangle is:"+len*breath);
	}
	
	void parameter()
	{
		System.out.println("Parametars or Rectangle is:"+2*(len+breath));
	}
    
		
	Rectangle(int l,int b){
		len=l;
		breath=b;
		
	}
		 
}	 
		 


