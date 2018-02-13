package cards;

public enum FaceValue {
	Ace(1),
	Two(2),
	Three(3),
	Four(4),
	Five(5),
	Six(6),
	Seven(7),
	Eight(8),
	Nine(9),
	Ten(10),
	Jack(11),
	Queen(12),
	King(13);
	
	//other cardvalue rules for other card games
	public static final int[] STANDARD_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	public static final int[] ACE_HIGH_VALUES = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	public static final int[] BLACK_JACK_VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	private int value;

	FaceValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void setValues(int[] values) {
		for (int i = 0; i < FaceValue.values().length; i++) {
			FaceValue.values()[i].value = values[i];
		}
	}
	
}