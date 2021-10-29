package Assignment1;
import java.util.*;
/**
 * This class is the program that plays rock paper scissors with a user.
 * The program is interactive. 
 * When the program is executed it will prompt the user to enter the number of rounds to be played,
 * between 1 and 10. The program then lets the user to choose whether they want to play
 * rock, paper, or scissors. The program responds by randomizing a choice, and lets user know whether
 * or not they have won that round. At the end, the total number of user wins, computer wins, and ties
 * will be displayed, as well as who the overall winner is.
 * 
 * @author Yi Yang
 *
 */
public class RockPaperScissors {
	/**
	 * The main method of the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			int numRounds;
			int userChoice, computerChoice;
			int tie=0, userWin=0, computerWin=0;
			System.out.print("Enter number of rounds of game, between 1 and 10: "); //asks user for number of rounds
			numRounds = scan.nextInt(); //reads user input
			//checks if it is in range
			if (numRounds<1 || numRounds>10) {
				System.out.println("Invalid input for number of rounds, must be between 1 and 10.");
				System.exit(-1);
			}
			for (int i=0; i<numRounds; i++) {
				//asks user what they want to play
				System.out.println("1. Rock");
				System.out.println("2. Paper");
				System.out.println("3. Scissors");
				System.out.print("Enter your choice: ");
				userChoice = scan.nextInt(); //reads user input
				computerChoice = rand.nextInt(3) + 1; //generates a random choice
				//in tie situations
				if(userChoice==computerChoice) {
					tie++;
					System.out.println("Tie");
				}
				//in win/loss situations
				else if(userChoice==1) {
					if(computerChoice==2) {
						computerWin++;
						System.out.println("Computer Wins");
					}
					else if(computerChoice==3) {
						userWin++;
						System.out.println("User Wins");
					}
				}
				else if(userChoice==2) {
					if(computerChoice==1) {
						userWin++;
						System.out.println("User Wins");
					}
					else if(computerChoice==3) {
						computerWin++;
						System.out.println("Computer Wins");
					}
				}
				else if(userChoice==3) {
					if(computerChoice==1) {
						computerWin++;
						System.out.println("Computer Wins");
					}
					else if(computerChoice==2) {
						userWin++;
						System.out.println("User Wins");
					}
				}
			} 
			//lets user know the statistics
			System.out.println("Ties: " + tie);
			System.out.println("User wins: " + userWin);
			System.out.println("Computer wins: " + computerWin);
			if(userWin > computerWin)
				System.out.println("Overall winner: User");
			else if(computerWin > userWin)
				System.out.println("Overall winner: Computer");
			else
				System.out.println("Overall winner: Tie");
			//prompts for rematch
			System.out.println("Do you want to play again? yes/no ");
			String ans = "";
			ans = scan.next();
			if(ans.equalsIgnoreCase("yes"))
				continue;
			else
				System.out.println("Thanks for playing!");
				break;
		}
		scan.close();
	}
}
