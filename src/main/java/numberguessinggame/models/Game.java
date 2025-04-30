package numberguessinggame.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private int randomNumber;
	private int round;
	private int maxRounds;
	
	private List<Integer> guessLog;
	
	public Game(int randomNumber, int maxRounds, int round) {
		this.randomNumber = randomNumber;
		this.round = round;
		this.maxRounds = maxRounds;
		this.guessLog = new ArrayList<Integer>();
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public int getRound() {
		return round;
	}

	public int getMaxRounds() {
		return maxRounds;
	}

	public List<Integer> getGuessLog() {
		return guessLog;
	}

	public void addGuessLog(int value) {
		guessLog.add(value);
	}

}
