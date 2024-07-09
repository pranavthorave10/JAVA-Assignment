package ArraysAssignment;

public class AvgValueOFArray {

	public static void main(String[] args) {
		
		 int[] array = {55, 66, 44, 22, 55, 77};
	        int sum = 0;
	        for (int value : array) {
	            sum += value;
	        }
	        double average = sum / (double) array.length;
	        System.out.println("Average value of array elements: " + average);
	    }
	}


