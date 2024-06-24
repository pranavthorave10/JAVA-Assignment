package AssignmentQuestions;

import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = SC.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = SC.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

	}

}
