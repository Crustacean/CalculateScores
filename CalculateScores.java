public class CalculateScores {
	
	public static int calculateHighScorePosition(int score){
		
		int position = 4;
		
		if (score >= 1000) {
			position = 1;
		}else if ( score >= 500 && score < 1000 ){
			position = 2;
		}else if ( score >= 100 && score < 500 ) {
			position = 3;
		}
		
		return position;
		
	}
	
	public static void displayHighScorePosition(String playerName, int playerPosition){
		System.out.println(playerName+" managed to get into position " +playerPosition+" on the high score list");
	}	
	
	public static void main(String[] args){
		
		int score = 1500;
		String name = "Tim";
				
		displayHighScorePosition(name, calculateHighScorePosition(score));
		
		score = 1000;
		displayHighScorePosition(name, calculateHighScorePosition(score));
		
		score = 5000;
		displayHighScorePosition(name, calculateHighScorePosition(score));
		
		score = 100;
		displayHighScorePosition(name, calculateHighScorePosition(score));
		
		score = 25;
		displayHighScorePosition(name, calculateHighScorePosition(score));
		
	}
	
}