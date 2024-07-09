package StringExamp;

import java.util.Scanner;

public class PrintMyName {

	public static void myname(String name) {
		
		System.out.println(name);
		return;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		myname(name);
		
		

	}

}
