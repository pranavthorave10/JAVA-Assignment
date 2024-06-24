package AssignmentQuestions;

import java.util.Scanner;

public class TwoNumbersSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int N1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int N2 = scanner.nextInt();
        int sum = N1 + N2;
        System.out.println("The sum is: " + sum);

	}

}
