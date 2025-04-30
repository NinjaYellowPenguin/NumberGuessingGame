package numberguessinggame.text;

public interface TextContainer {
    String getIntroText();
    String getSelectDifficultyText();
    String getSelectionText(String difficulty);
    String getInputText();
    String getIncorrectResponse(String com, int value);
    String getCorrectResponse(int attempts);
    
    String getEasyText();
    String getMediumText();
    String getHardText();
    
    String getLessText();
    String getGreaterText();
    
    String getGameLvlInputError();
}
