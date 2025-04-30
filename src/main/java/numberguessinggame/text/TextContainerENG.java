package numberguessinggame.text;

public class TextContainerENG implements TextContainer {

    @Override
    public String getIntroText() {
        return "Welcome to the Number Guessing Game!\r\n"
             + "I'm thinking of a number between 1 and 100.\r\n"
             + "You have 5 chances to guess the correct number.\r";
    }

    @Override
    public String getSelectDifficultyText() {
        return "Please select the difficulty level:\r\n"
             + "1. Easy (10 chances)\r\n"
             + "2. Medium (5 chances)\r\n"
             + "3. Hard (3 chances)";
    }
    
    @Override
	public String getLvlInputText() {
		return "Enter your choice: \r\n";
	}

    @Override
    public String getSelectionText(String difficulty) {
        return "Great! You have selected the " + difficulty + " difficulty level.\r\nLet's start the game!";
    }

    @Override
    public String getInputText() {
        return "Enter your guess: ";
    }

    @Override
    public String getIncorrectResponse(String com, int value) {
        return "Incorrect! The number is "+com+" than "+value+"";
    }

    @Override
    public String getCorrectResponse(int attempts) {
        return "Congratulations! You guessed the correct number in "+attempts+" attempts.";
    }
    
    @Override
    public String getEasyText() {
    	return "easy";
    }
    
    @Override
    public String getMediumText() {
    	return "medium";
    }
    
    @Override
    public String getHardText() {
    	return "hard";
    }
    
    @Override
    public String getLessText() {
    	return "less";
    }
    
    @Override
    public String getGreaterText() {
    	return "greater";
    }

	@Override
	public String getGameLvlInputError() {
		return "The level should be between 1 and 3.";
	}
	@Override
	public String getGameComandInputError() {
		return "You must enter a command or a number.";
	}

	@Override
	public String gameOverText() {
		return "It seems the penguins don't bless you.";
	}

	@Override
	public String getPlayAgainText() {

		return "   _                                                     _           \r\n"
				+ " ('v')         Do you want to play again? (y/n)        ('v')\r\n"
				+ "//-=-\\\\                                               //-=-\\\\        \r\n"
				+ "(\\_=_/)                                               (\\_=_/)        \r\n"
				+ " ^^ ^^                                                 ^^ ^^   ";
	}
    
}
