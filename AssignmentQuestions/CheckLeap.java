package AssignmentQuestions;

import java.util.Scanner;

public class CheckLeap {

	public static void main(String[] args) {
	
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = SC.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	}}
	
