package Pattern;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
		int Num = SC.nextInt();
		
		for (int i = 1; i <= Num; i++) {
			
        	for (int j = 1; j <=i; j++) {
            
        		System.out.print("*");
        }
        	System.out.println();
        	
    }

	}
}
