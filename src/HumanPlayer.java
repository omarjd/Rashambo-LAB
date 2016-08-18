
public class HumanPlayer extends Player {
	private String humanInput; 
	
	
	public HumanPlayer(String name, String humanInput) {
		super(name);
		this.humanInput = humanInput;
	}



	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		if (humanInput.equalsIgnoreCase("p"))
			return Roshambo.PAPER;	
		else if (humanInput.equalsIgnoreCase("r"))
			return Roshambo.ROCK;
		else if (humanInput.equalsIgnoreCase("s"))
			return Roshambo.SCISSORS;
		
		return super.generateRoshambo();
		}
	
	
	}

