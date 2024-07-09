package ArraysAssignment;

public class SumValuesInArray {

	public static void main(String[] args) {
		
		
		int[] values = {34, 56, 78, 20, 78, 90, 74};
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of array values: " + sum);
    }
	}
