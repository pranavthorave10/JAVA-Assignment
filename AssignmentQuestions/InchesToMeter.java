package AssignmentQuestions;

import java.util.Scanner;

public class InchesToMeter {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter value in inches: ");
        double inches = SC.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters.");
    }
	}

