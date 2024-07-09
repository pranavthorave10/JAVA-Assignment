package ArraysAssignment;

public class MinMaxArray {

	public static void main(String[] args) {
		
		 int[] array = {45, 67, 98, 63, 59, 24, 48};
	        int max = array[0];
	        int min = array[0];
	        for (int value : array) {
	            if (value > max) {
	                max = value;
	            }
	            if (value < min) {
	                min = value;
	            }
	        }
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }
	}

