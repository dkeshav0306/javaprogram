package array;

public class Array1 {

	 public static void main(String[] args) {
	        int[] array = {5, 8, 2, 1, 9, 3};
	        int min = findMinimumValue(array);
	        System.out.println("The minimum value in the array is: " + min);
	    }

	    public static int findMinimumValue(int[] array) {
	        
	        int min = array[0]; // Assume the first element is the minimum

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i]; // Update the minimum value
	            }
	        }

	        return min;
	    }
}
