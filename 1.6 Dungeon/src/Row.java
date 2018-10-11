import java.util.ArrayList;

public class Row {
    private int lenght;
    private ArrayList<Square> row; 


    public Row(int x, int lenght) {
	this.lenght = lenght;
	this.row = new ArrayList<Square>();
	for (int y = 0; y < lenght ; y++) {
	    this.row.add(new Square(x,lenght,'.'));
	}
    }

    public int getLenght() {
        return lenght;
    }


    public void setLenght(int lenght) {
        this.lenght = lenght;
    }


    public ArrayList<Square> getRow() {
        return row;
    }


    public void setRow(ArrayList<Square> row) {
        this.row = row;
    }
    
    public char returnCharacterName(int y) {
	return this.row.get(y).getName();
    }
    
    public void removeCharacter(int y) {
	this.row.get(y).setName('.');
    }
    
    public void putCharacter(int y,char name) {
	this.row.get(y).setName(name);
    }
}
