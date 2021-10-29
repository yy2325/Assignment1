package Assignment1;
/**
 * This class is the program that calculates an array's sum.
 * When the program is executed it will display the arrays' sums
 * 
 * @author Yi Yang
 *
 */
public class SummativeSums {
    /**
     * Method that calculates the sum of all elements of an int array
     * @param array int array
     * @return sum
     */
	public static int arraySum(int array[]) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum = sum+array[i];
		}
		return sum;
	}
	/**
	 * The main method of the program
	 * @param args
	 */
	public static void main(String[] args) {
		//test cases
		int arr[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int arr2[] = { 999, -60, -77, 14, 160, 301 };
		int arr3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
		// prints all array sums
		System.out.println("#1 Array Sum: "+arraySum(arr));
		System.out.println("#2 Array Sum: "+arraySum(arr2));
		System.out.println("#3 Array Sum: "+arraySum(arr3));
	}
}
