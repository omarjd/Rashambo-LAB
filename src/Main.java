import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Rock Paper Scissors!");
		
		System.out.println("Enter your name: "); 
		String name = in.nextLine(); 
		
		System.out.println("Would you like play against MrRobort or TheShark (R/S)? ");
		String pcPlayer = in.nextLine(); 
		
		if (pcPlayer.equals("R")) {
			RockPlayer pcPlayerObject = new RockPlayer("Mr. Robort"); 
			System.out.println("Rock, paper, or scissors? (R/P/S)");
			String humanInput = in.nextLine();  
			
			HumanPlayer player = new HumanPlayer(name, humanInput);
			
			System.out.println(pcPlayerObject.getName() + ": " + pcPlayerObject.generateRoshambo());
			System.out.println(player.getName() + ": " + player.generateRoshambo());
			
			System.out.println("You " + player.generateRoshambo().compare(pcPlayerObject.generateRoshambo()));
		} 
		
		
	}
	
	

}
