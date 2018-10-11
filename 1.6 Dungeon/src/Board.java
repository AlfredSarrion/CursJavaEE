import java.util.ArrayList;

public class Board {
    private int lenght;
    private int height;
    private ArrayList<Row> rows;

    public Board(int lenght, int height) {
	this.lenght = lenght;
	this.height = height;
	this.rows = new ArrayList<Row>();

	for (int x = 0; x < lenght ; x++) {
	    for (int y = 0; y < height ; y++) {
		this.rows.add(new Row(x,y));
	    }
	}
    }
    
    public void clearBoard() {
	for (int x = 0; x < this.lenght ; x++) {
	    for (int y = 0; y < this.height ; y++) {
		this.rows.get(x).removeCharacter(y);
	    }
	}
    }
    
    public char returnCharacterName(int x, int y) {
	return this.rows.get(x).returnCharacterName(y);
    }
   
}
