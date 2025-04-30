package numberguessinggame.services;

import java.util.Random;
import java.util.Scanner;

import numberguessinggame.models.Game;
import numberguessinggame.text.TextContainer;
import numberguessinggame.text.TextContainerENG;
import numberguessinggame.text.TextContainerESP;

public class GameService {

	private TextContainer textContainer;
	private Scanner scanner = new Scanner(System.in);	
	
	public void startGame() {
		startGame(new TextContainerENG());	
	}
	public void startGame(String languaje) {
		if(languaje.toUpperCase().equals("ESP") || languaje.toUpperCase().equals("ESPAÑOL") || languaje.toUpperCase().equals("SPANISH")) {
			textContainer = new TextContainerESP();
			startGame(textContainer);
		}else {
			startGame();
		}				
	}
	private void startGame(TextContainer textContainer) {
		this.textContainer = textContainer;
		showText(textContainer.getIntroText());
		showText(textContainer.getSelectDifficultyText());
		String valueS = inputText(textContainer.getLvlInputText());
		
		Game game = new Game((new Random().nextInt(100) + 1),
				getMaxRounds(Integer.parseInt(valueS)), 0);
		startLoop(game);
	}
	
	private void startLoop(Game game) {
		boolean loop = true;
		while(loop) {
			game.newRound();
			
			String comand = inputText(textContainer.getInputText());
			
			if(comand.toUpperCase().equals("QUIT")) break;		 
			if(checkNumber(parseInt(comand), game)) break;
			if(checkRounds(game)) break;
			// Save scoreLog;
		}
		
		if(inputText(textContainer.getPlayAgainText()).equals("y")) {
			startGame(textContainer);
		}
	}
	
	private boolean checkRounds(Game game) {
		if(game.getRound() >= game.getMaxRounds()) {
			showText(textContainer.gameOverText());
			return true;
		}
		return false;
	}
	private int parseInt(String number) {
		try {
			int num = Integer.parseInt(number);
			return num;
		} catch (Exception e) {
			throw new GameRuntimeException(textContainer.getGameComandInputError());
		}
	}
	
	private boolean checkNumber(int input, Game game) {
		if(input == game.getRandomNumber()) {
			showText(textContainer.getCorrectResponse(game.getRound()));
			return true;
		}else if(input > game.getRandomNumber()){
			String com = textContainer.getLessText();
			showText(textContainer.getIncorrectResponse(com, input));
			return false;
		}else {
			String com = textContainer.getGreaterText();
			showText(textContainer.getIncorrectResponse(com, input));
			return false;
		}
	}
	
	private int getMaxRounds(int lvl) {
		String diff = "";
		int maxRounds = 0;
		if(lvl == 1) {
			diff = textContainer.getEasyText();
			maxRounds = 10;
		}else if(lvl == 2) {
			diff = textContainer.getMediumText();
			maxRounds = 5;
		}else if(lvl == 3) {
			diff = textContainer.getHardText();
			maxRounds = 3;
		}else {
			throw new GameRuntimeException(textContainer.getGameLvlInputError());
		}
		showText(textContainer.getSelectionText(diff));
		return maxRounds;
	}
	
	
	
	public String inputText(String text) {
		 System.out.print(text);
		 return scanner.next();
	}
	
	private void showText(String text) {
		System.out.println(text);
		System.out.println("");
	}
}

class GameRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GameRuntimeException(String message) {
        super(message);
    }
}

