package AssignmentQuestions;

import java.util.Scanner;

public class AreaParameter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

	}

}
