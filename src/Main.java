import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String gameResult;
		int pcRoundWin=0;
		int playerRoundWin=0;
		String playerName; 
		String pcPlayerName; 
		String playAgain="y"; 

		System.out.println("Welcome to Rock Paper Scissors!");

		System.out.println("Enter your name: ");
		String name = in.nextLine();

		System.out.println("Would you like play against MrRobort or TheShark (R/S)? ");
		String pcPlayer = in.nextLine();
		
		if (pcPlayer.equalsIgnoreCase("R")) {
			while (playAgain.equalsIgnoreCase("y")) {
				RandomPlayer pcPlayerObject = new RandomPlayer("Mr. Robort");
				System.out.println("Rock, paper, or scissors? (R/P/S)");
				String humanInput = in.nextLine();
				HumanPlayer player = new HumanPlayer(name, humanInput);
				playerName = player.getName();
				pcPlayerName = pcPlayerObject.getName();
				System.out.println(pcPlayerName + ": " + pcPlayerObject.generateRoshambo());
				System.out.println(playerName + ": " + player.generateRoshambo());
				gameResult = player.generateRoshambo().compare(pcPlayerObject.generateRoshambo());
				switch (gameResult) {
				case "Win!":
					System.out.println(playerName + " Win!");
					playerRoundWin++;
					break;
				case "Lose":
					System.out.println(pcPlayerName + " Win!");
					pcRoundWin++;
					break;
				case "Draw!":
					System.out.println("Draw!");
				}
				System.out.println(playerName + " won " + playerRoundWin + " times.");
				System.out.println(pcPlayerName + " won " + pcRoundWin + " times.");
				System.out.println("Do you want Play another game? (y/n): ");
				playAgain = in.nextLine();
			}
		}

		else if (pcPlayer.equalsIgnoreCase("S")) {
			while (playAgain.equalsIgnoreCase("y")) {
				RockPlayer pcPlayerObject = new RockPlayer("The Shark");
				System.out.println("Rock, paper, or scissors? (R/P/S)");
				String humanInput = in.nextLine();
				HumanPlayer player = new HumanPlayer(name, humanInput);
				playerName = player.getName();
				pcPlayerName = pcPlayerObject.getName();
				System.out.println(pcPlayerName + ": " + pcPlayerObject.generateRoshambo());
				System.out.println(playerName + ": " + player.generateRoshambo());
				gameResult = player.generateRoshambo().compare(pcPlayerObject.generateRoshambo());
				switch (gameResult) {
				case "Win!":
					System.out.println(playerName + " Win!");
					playerRoundWin++;
					break;
				case "Lose":
					System.out.println(pcPlayerName + " Win!");
					pcRoundWin++;
					break;
				case "Draw!":
					System.out.println("Draw!");
				}
				System.out.println(playerName + " won " + playerRoundWin + " times.");
				System.out.println(pcPlayerName + " won " + pcRoundWin + " times.");
				System.out.println("Do you want Play another game? (y/n): ");
				playAgain = in.nextLine();
			}
			
		}

		in.close();
	} 
	
}
