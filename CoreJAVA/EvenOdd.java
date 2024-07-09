package CoreJAVA;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the marks of Ram");
		
				Scanner M1=new Scanner(System.in);
				
				int Ram =M1.nextInt();
				System.out.println("Enter the marks of Sham :");
				Scanner M2=new Scanner(System.in);
				int Sham =M2.nextInt();
				
				if (Ram>=2*Sham)
				{
					System.out.println("Ram is Happay");
				}
				else {
					System.out.println("Ram is not Happy");
				}
				
	}

}
