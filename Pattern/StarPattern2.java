package Pattern;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int n = SC.nextInt();
		
		 for (int i = 1; i  <= n; i++) {
			 
	            for (int j = 1; j  <=  n; j++) {
	            	
	         
	                if (i == 1 || j == 1 || j == 5 || i == 5)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }

	}

}
