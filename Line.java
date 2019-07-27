
public abstract class Line extends Shape{

	protected int length;
	
	public Line(char paintChar, int length) {
		super(paintChar);
		this.length = length;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

}
