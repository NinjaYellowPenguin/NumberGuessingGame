package numberguessinggame.models;

public enum DifficultyLevel {
	
	Easy(1),Medium(2),Hard(3);
	
	private int lvl;

	DifficultyLevel(int lvl) {
		this.lvl = lvl;
	}

}
