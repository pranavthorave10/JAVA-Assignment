package AssignmentQuestions;

import java.util.Scanner;

public class Remender {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = SC.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = SC.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
	}

