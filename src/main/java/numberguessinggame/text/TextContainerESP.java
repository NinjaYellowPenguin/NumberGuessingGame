package numberguessinggame.text;

public class TextContainerESP implements TextContainer {

    @Override
    public String getIntroText() {
        return "¡Bienvenido al Juego de Adivinar el Número!\r\n"
             + "Estoy pensando en un número entre 1 y 100.\r\n"
             + "Tienes 5 intentos para adivinar el número correcto.\r\n\n";
    }

    @Override
    public String getSelectDifficultyText() {
        return "Por favor, selecciona el nivel de dificultad:\r\n"
             + "1. Fácil (10 intentos)\r\n"
             + "2. Medio (5 intentos)\r\n"
             + "3. Difícil (3 intentos)";
    }
    
    @Override
	public String getLvlInputText() {
		return "Que nivel prefieres? (El 1 es de cobardes): ";
	}

    @Override
    public String getSelectionText(String difficulty) {
        return "¡Genial! Has seleccionado el nivel de dificultad " + difficulty + ".\r\n¡Comencemos el juego!";
    }

    @Override
    public String getInputText() {
        return "Ingresa tu número: ";
    }

    @Override
    public String getIncorrectResponse(String com, int value) {
        return "¡Incorrecto! El número es " + com + " que " + value;
    }

    @Override
    public String getCorrectResponse(int attempts) {
        return "¡Felicidades! Adivinaste el número correcto en " + attempts + " intentos.";
    }

    @Override
    public String getEasyText() {
        return "fácil";
    }

    @Override
    public String getMediumText() {
        return "medio";
    }

    @Override
    public String getHardText() {
        return "difícil";
    }

    @Override
    public String getLessText() {
        return "menor";
    }

    @Override
    public String getGreaterText() {
        return "mayor";
    }

	@Override
	public String getGameLvlInputError() {
		return "El nivel debe estar entre 1 y 3.";
	}

	@Override
	public String getGameComandInputError() {
		return "Debes poner un comando o un número.";
	}
}

