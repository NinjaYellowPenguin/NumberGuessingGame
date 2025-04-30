package numberguessinggame.models;

public enum Languaje {
	English("ENG"), Spanish("ESP");
	
	private String tag;

	Languaje(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}	
}
