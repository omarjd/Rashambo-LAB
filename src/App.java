import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Welcome to Rock Paper Scissors!");

		System.out.println("Enter your name: ");
		String name = in.nextLine();
		
		System.out.println("Would you like play against MrRobot or TheShark (R/S)? ");
		String pChose = in.nextLine();
		
		Player p1; 
		Player p2; 
		
		if (pChose.equalsIgnoreCase("r")){
			p2 = new RandomPlayer("Mr. Robot");
		} else if (pChose.equalsIgnoreCase("s")){
			p2 = new RockPlayer("The Shark");
		} 
		
		String playAgain = "y"; 
		while (playAgain.equalsIgnoreCase("y")){
			System.out.println("Rock, paper, or scissors? (R/P/S)");
			String p1Played = in.nextLine();
		// need to complete the program in the better way 
		}
	}

}
