package CoreJAVA;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		

		Scanner SC = new Scanner(System.in);
        System.out.print("Enter the month (1 to12): ");
        int month = SC.nextInt();
        int days = 0;

        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10:
            case 12: 
                days = 31;
                System.out.println(days);
                break;
            case 4: 
            case 6: 
            case 9:
            case 11:
                days = 30;
                System.out.println(days);
                break;
            case 2: 
            	days =29;
            	System.out.println(days);
                break;
                
                default:
                System.out.println(days);
                	
        }
        SC.close();
    }

	
}
