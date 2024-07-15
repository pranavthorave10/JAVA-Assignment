package com.RTOLaw;

import java.util.Scanner;


class UnderAgeException extends Exception{
	
	public String getMessage() {
		return "The Age is Less than the 18 - UnderAge";
	}
}

class OverAgeException extends Exception{
	
	public String getMessage() {
		return "The Age is More than the 60 - OverAge";
	}
}

class Age{
	private int underage = 18;
	private int age;
	private int overage = 60;
	
	void EnterAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of Candidate");
		age = sc.nextInt();
		sc.close();
		
}
	

	void validateAge() throws UnderAgeException, OverAgeException {
        if (age < underage) {
            throw  new UnderAgeException();
        } else if (age > overage) {
            throw new OverAgeException();
        } else {
            System.out.println("The Candidate is of valid age and qualifies for Documentation");
        }
    }
}

class RTO {
	
	void enterAGE() {
        Age ag = new Age();
        try {
            ag.EnterAge();
            ag.validateAge();
            System.out.println("The Final Result is Here");
        } catch (UnderAgeException | OverAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
	
public class Demo {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.enterAGE();
		
	}}

