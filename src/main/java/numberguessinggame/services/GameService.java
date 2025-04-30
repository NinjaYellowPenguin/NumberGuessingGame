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
		}else {
			startGame();
		}				
	}
	private void startGame(TextContainer textContainer) {
		this.textContainer = textContainer;
		showText(textContainer.getIntroText());
		String valueS = inputText(textContainer.getInputText());
		
		Game game = new Game(new Random().nextInt() - 1,
				getMaxRounds(Integer.parseInt(valueS)), 0);
		startLoop(game);
		// Empezar Juego
		// Preguntar hasta maxrounds o acierto
		// Guardar Resultados del game
	}
	
	private void startLoop(Game game) {
		
	}
	
	public void quitGame() {
		
	}
	
	private int getMaxRounds(int lvl) {
		if(lvl == 1) {
			return 10;
		}else if(lvl == 2) {
			return 5;
		}else if(lvl == 3) {
			return 3;
		}else {
			throw new GameRuntimeException(textContainer.getGameLvlInputError());
		}
	}
	
	
	
	public String inputText(String text) {
		 System.out.print(text);
		 return scanner.next();
	}
	
	private void showText(String text) {
		System.out.println(text);
	}
}

class GameRuntimeException extends RuntimeException {

	public GameRuntimeException(String message) {
        super(message);
    }
}

