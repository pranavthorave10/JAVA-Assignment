package CoreJAVA;

import java.util.Scanner;

public class IfElseLoop {

	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		System.out.println(" Enter the Score Here ");
		int Score = SC.nextInt();
		
		
		if (Score>= 90) {
			System.out.println("Grade A");
		}else if (Score >= 80) {
			System.out.println("Grade B");
		}else if (Score>= 70) {
			System.out.println("Grade C");
		}else if (Score>= 60) {
			System.out.println("Grade D");
		}else {
			System.out.println("Grade F");
		}
		

	}

}
