package test;

public class Graps implements Fruit {

	@Override
	public void color() {
		System.out.println("Green and red");
		
	}

	@Override
	public void place() {
		System.out.println("kabul");
		
	}

	@Override
	public void shape() {
		System.out.println("elongated and round");
		
	}
	
	public static void main(String[]args){
		
		Apple a=new Apple();
		a.color();
		a.place();
		a.shape();
		Orange o=new Orange();
		o.color();
		o.place();
		o.shape();
		Graps g=new Graps();
		g.color();
		g.place();
		g.shape();
				
				
				
		
		
		
		
	}
	
	
	

}
