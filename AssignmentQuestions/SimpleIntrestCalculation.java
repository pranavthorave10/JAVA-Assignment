package AssignmentQuestions;

import java.util.Scanner;

public class SimpleIntrestCalculation {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = SC.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = SC.nextDouble();
        System.out.print("Enter time in years: ");
        int time = SC.nextInt();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple interest: " + interest);
    }
	}

