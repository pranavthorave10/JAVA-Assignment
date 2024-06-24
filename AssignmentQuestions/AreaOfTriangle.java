package AssignmentQuestions;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {


		Scanner SC = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        double base = SC.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = SC.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);

	}

}
