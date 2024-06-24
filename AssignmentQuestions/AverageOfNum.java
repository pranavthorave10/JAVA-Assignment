package AssignmentQuestions;

import java.util.Scanner;

public class AverageOfNum {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int N1 = SC.nextInt();
        System.out.print("Enter second number: ");
        int N2 = SC.nextInt();
        System.out.print("Enter third number: ");
        int N3 = SC.nextInt();
        int AVG = (N1 + N2 + N3);
        int Average = AVG/3;
        System.out.println("The average is: " + Average);

	}

}
