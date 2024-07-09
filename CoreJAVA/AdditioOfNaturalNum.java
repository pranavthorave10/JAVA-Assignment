package CoreJAVA;

import java.util.Scanner;

public class AdditioOfNaturalNum {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int Num = SC.nextInt();
		
		int Sum =0;
		
		for (int i = 1; i <=Num; i++) {
            	Sum =Sum + i;
            
		}
                System.out.println(Sum);


	}

}
