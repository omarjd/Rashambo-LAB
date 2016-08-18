import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		//HumanPlayer p1 = new HumanPlayer(name, humanInput);
		RockPlayer p2 = new RockPlayer("r");
		RandomPlayer p3 = new RandomPlayer("d");
		Roshambo playerChose = p2.generateRoshambo();
		Roshambo Player2Chose = p3.generateRoshambo(); 
		RandomPlayer p4 = new RandomPlayer("d");
		int result = playerChose.compare(Player2Chose);
		Roshambo Player3Chose = p4.generateRoshambo();
		int result2 = Player3Chose.compare(playerChose);
		System.out.println(result2);
	}

}
