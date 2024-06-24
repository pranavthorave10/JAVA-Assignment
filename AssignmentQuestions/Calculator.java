package AssignmentQuestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = SC.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = SC.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = SC.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }
	}

