package CoreJAVA;

public class MethodsInJava {
	
    int a ,b;
	int c;
	
	int Add() {
		
		a =10;
	    b =20;
	    
		c = a +b;
		return c;
	}
	
	
	
	public static void main(String[] args) {
		
		
		MethodsInJava MJ = new MethodsInJava();
		
		
		System.out.println(MJ.Add());
		

	}

}
