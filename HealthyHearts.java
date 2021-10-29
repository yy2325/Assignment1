package Assignment1;
import java.util.*;
/**
 * This class is the program that lets you know your max and target heart rate for your age.
 * The program is interactive. 
 * When the program is executed it will prompt the user to enter the their age.
 * Then the program will display your maximum heart rate, and target target heart rate zone.
 * 
 * @author Yi Yang
 *
 */
public class HealthyHearts{
	/**
	 * Method that calculates the target heart rate range, and print it out in a neat format
	 * @param heartRate integer value representing the heart rate
	 * @return formatted string that contains the range of target heart rate range
	 */
    public static String getTargetHeartRate(int heartRate){
        return String.format("%.0f - %.0f", heartRate * 0.5, heartRate * 0.85);
    }
    /**
     * The main method of the program
     * @param args
     */
    public static void main(String[] args){
    	int age, maxHeartRate;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = myScanner.nextInt(); //reads user input
        maxHeartRate = 220 - age; // calculates maximum heart rate
        System.out.printf("Your maximum heart rate should be %d beats per minute\n", maxHeartRate);
        System.out.printf("Your target HR zone is %s beats per minute\n", getTargetHeartRate(maxHeartRate));
        myScanner.close();
    }
}
