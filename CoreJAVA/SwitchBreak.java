package CoreJAVA;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		
		
		   Scanner SC = new Scanner(System.in);
		   
		   
		   System.out.println("Enter the First number");
		   int N1 =SC.nextInt();
		   
		   System.out.println("Enter the Second number");
		   int N2 =SC.nextInt();
		   
		   System.out.println("Enter A for Addition, Enter S for Substraction, Enter M for multiplication");
		   
		   String Action = SC.next();
		   switch(Action) {
		   
		   case "A" :
			   System.out.println(N1 + N2);
			   break;
			   
		   case "S":
			   System.out.println(N1-N2);
			   
			  break;
		   case "M":
			   System.out.println(N1*N2);
			   break;
			   
		   }
		   
		   
			   
		        

	}}


