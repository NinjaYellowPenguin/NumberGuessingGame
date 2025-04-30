package numberguessinggame.main;

import numberguessinggame.services.GameService;

public class Main {

	public static void main(String[] args) {
		
		GameService service = new GameService();
		//service.startGame("ESP"); // Para jugarlo en castellano
		service.startGame();

	}

}
