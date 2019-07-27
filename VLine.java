
public class VLine extends Line{

	public VLine(char paintChar, int length) {
		super(paintChar, length);
	}
	
	public void paintOn(Screen screen, int xStart, int yStart) {
		int yEnd = yStart + this.length;
		
		for(int i = yStart; i < yEnd; i++) {
			screen.paintAt(xStart, i, this.getPaintChar());
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
		VLine line = new VLine('-', test[0]);
		line.paintOn(sc, test[1], test[2]);
		sc.draw();
	}
	
	Screen sc = new Screen(15, 10, '*');
	VLine line = new VLine('-', 5);
	line.paintOn(sc);
	sc.draw();
	}

}
