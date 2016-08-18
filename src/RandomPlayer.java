import java.util.Random;

public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

//	private static int COUNT =0;

	@Override
//	public Roshambo generateRoshambo() {
//		COUNT++;
//		if (COUNT % 3 == 0)
//			return Roshambo.PAPER; 
//		else if (COUNT % 3 == 1)
//			return Roshambo.ROCK; 
//		else if (COUNT % 3 == 2)
//			return Roshambo.SCISSORS;
//		return generateRoshambo();
//	}
	
	public Roshambo generateRoshambo(){
        // Usually this can be a field rather than a method variable
        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt(3);
        
        if (randomNum == 0){
            return Roshambo.ROCK;
        }else if (randomNum == 1){
            return Roshambo.PAPER;
        }else
            return Roshambo.SCISSORS;
    
    }
	
	
}
