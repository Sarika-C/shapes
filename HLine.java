
public class HLine extends Line{
	
	public HLine(char paintChar, int length) {
		super(paintChar, length);
	}
	
	public void paintOn(Screen screen, int xStart, int yStart) {
		int xEnd = xStart + this.length;
		
		for(int i = xStart; i < xEnd; i++) {
			screen.paintAt(i, yStart, this.getPaintChar());
		}
	}

	public static void main(String[] args) {
		int tests[][] = {{1, 0, 0},
					{5, 2, 3},
					{1, 4, 9}, 
					{6, 7, 0},
					{2, 14, 9},
					{7, 12, 9},
					{2, 13, 8},
					{0, 9, 8}};
		
		for(int[] test: tests) {
			Screen sc = new Screen(15, 10, '*');
			HLine line = new HLine('-', test[0]);
			line.paintOn(sc, test[1], test[2]);
			sc.draw();
		}
		
		Screen sc = new Screen(15, 10, '*');
		HLine line = new HLine('-', 5);
		line.paintOn(sc);
		sc.draw();

	}

}
