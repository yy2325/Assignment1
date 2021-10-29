package Assignment1;
import java.util.*; 
/**
 * This class is the program that tells you your dog breed.
 * The program is interactive. 
 * When the program is executed it will prompt the user to enter the name of the dog.
 * Then the program will display 5 random percentages of dog breeds.
 * 
 * @author Yi Yang
 *
 */
public class DogGenetics {
	/**
	 * The main method of the program
	 * @param args
	 */
	public static void main (String []args) {
		System.out.println("What is your dog's name?");
		Scanner myScanner = new Scanner(System.in); 
		String dogName = myScanner.nextLine(); // reads user input
		System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
		System.out.println(dogName + " is: ");
		
		int percentage = 100; //keeps track the current percentage left
		
		Random rand = new Random(); //creates an instance of random class
		//generates a random integer in range 0 to 100
		int randPercentage = rand.nextInt(percentage + 1);
		System.out.println( randPercentage + "% St. Bernard");
		//updates the total and comes up with a random integer in new range
		percentage -= randPercentage;
		randPercentage = rand.nextInt(percentage + 1);
		System.out.println( randPercentage + "% Chihuahua");   
		percentage -= randPercentage;
		randPercentage = rand.nextInt(percentage + 1);
		System.out.println( randPercentage + "% Dramatic RedNosed Asian Pug");
		percentage -= randPercentage;
		randPercentage = rand.nextInt(percentage + 1);
		System.out.println( randPercentage + "% Common Cur");   
		//last breed is however much that is left
		percentage -= randPercentage;
		System.out.println(percentage + "% King Doberman");
		System.out.println("Wow, that's QUITE the dog!");
		myScanner.close();
	}
}
