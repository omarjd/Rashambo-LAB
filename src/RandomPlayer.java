import java.util.Random;

public class RandomPlayer extends Player {
	Random rand = new Random();
	int randomNum = rand.nextInt(3);

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub

	}

	public Roshambo generateRoshambo() {
		if (randomNum == 2) {
			return Roshambo.ROCK;
		} else if (randomNum == 1) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}

	}

}
