package AssignmentQuestions;

import java.util.Scanner;

public class GratestThreeNo {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = SC.nextInt();
        System.out.print("Enter second number: ");
        int num2 = SC.nextInt();
        System.out.print("Enter third number: ");
        int num3 = SC.nextInt();
        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        System.out.println("The greatest number is: " + greatest);
    }

	
}
