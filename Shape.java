
public abstract class Shape {
	
	private char paintChar;

	public Shape(char paintChar) {
		this.paintChar = paintChar;
	}
	
	public abstract void paintOn(Screen screen, int xStart, int yStart);
	
	public void paintOn(Screen screen) {
		paintOn(screen, 0, 0);
	};

	/**
	 * @return the paintChar
	 */
	public char getPaintChar() {
		return paintChar;
	}

	/**
	 * @param paintChar the paintChar to set
	 */
	public void setPaintChar(char paintChar) {
		this.paintChar = paintChar;
	}

}
