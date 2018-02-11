package cards;

public enum Suit {
	Clubs(1),
	Diamonds(2),
	Hearts(3),
	Spades(4);

	private int value;

	Suit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
}
