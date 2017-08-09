package day1;

public class HelloWorld {
	
	void add (int a,int b){
		System.out.println(a+b);
	}
	
	void sub(int a,int b){
		System.out.println(a-b);
	}
    void mul(int a,int b){
    	System.out.println(a*b);
    }
    void division (int a, int b){
    	System.out.println(a/b);
    }
    
    
    public static void main(String[] args) {
		System.out.println("Hello world");
      HelloWorld H=new HelloWorld();
      H.add(5, 3);
      H.sub(5, 3);
      H.mul(5, 3);
      H.division(5, 3);
	}

}
