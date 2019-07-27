/**
 * Represents a 'window' in the output console. It is meant to be a character-
 * based version of a JFrame. This class will be used to 'paint' Shape objects
 * similar to how shapes are painted in Swing from the Java library. 
 * 
 * It is important to note that the upper left corner of the visible area
 * represents the ordered pair location (0,0). x-values increase from left to 
 * right and y-values increase from top to bottom.
 * 
 * @author kmarshall
 *
 */
public class Screen {

	private int width;
	private int height;
	private char border;
	private char[][] screen;
	
	/**
	 * Creates a Screen of a certain size and a given border character
	 * 
	 * @param width the width (number of columns) of the Screen
	 * @param height the height (number of rows) of the Screen
	 * @param border the character which will represent the border of the Screen
	 */
	public Screen(int width, int height, char border) {
		this.width = width;
		this.height = height;
		this.border = border;
		screen = new char[height][width];
		clear();
	}

	/**
	 * 'Clears' the Screen by replacing every character with a space ' '
	 */
	public void clear() {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				screen[i][j] = ' ';
			}
		}
	}
	
	/**
	 * prints the Screen in the output console
	 */
	public void draw() {
		for(int i = -1; i <= height; i++) {
			for(int j = -1; j <= width; j++) {
				if(i == -1 || j == -1 || i == height || j == width) {
					System.out.print(border + " ");
				}
				else {
					System.out.print(screen[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 'Paints' a single character at a single location on the Screen
	 * 
	 * @param x the x-coordinate of the location
	 * @param y the y-coordinate of the location
	 * @param pixel the character to 'paint' at this location
	 */
	public void paintAt(int x, int y, char pixel) {
		if(x >= 0 && y >= 0 && x < width & y < height) {
			screen[y][x] = pixel;
		}
	}
	
	/**
	 * @return the character used to paint the border
	 */
	public char getBorder() {
		return border;
	}

	/**
	 * @param border the border character to set
	 */
	public void setBorder(char border) {
		this.border = border;
	}

	/**
	 * @return the width of the Screen
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the height of the Screen
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * A short in-line test to show how the different methods work
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Screen sc = new Screen(15, 10, '*');
		
		sc.draw();
		
		sc.paintAt(3, 5, 'A');
		sc.paintAt(4, 2, 'B');
		
		sc.draw();

	}

}
