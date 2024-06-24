package AssignmentQuestions;

import java.util.Scanner;

public class SwapTwoVeriables {

	public static void main(String[] args) {
		
		
		 Scanner SC = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int num1 = SC.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = SC.nextInt();
	        int SW = num1;
	        num1 = num2;
	        num2 = SW;
	        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

	}
}

