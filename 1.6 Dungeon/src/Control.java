
public class Control {
    
    private Dungeon dungeon;
    private Board board;
    private Listener listener;
    private int lenght;
    private int height;

    public Control(int lenght, int height, int moves, int vampires, int gifts) {
	dungeon = new Dungeon(lenght, height, moves,vampires, gifts);
	board = new Board(lenght, height);
	listener = new Listener();
	this.endOfGame = false;
	
	
    }
    
    public void run() {
	while (true) {
	    // Check conditions for end of game
	    if (dungeon.getRemainingMoves()<= 0 || dungeon.getRemainingVampires() <=0 || !dungeon.getPlayer().isActive()) {
		break;		
	    }
	}
	
	// End of game
	if (dungeon.getRemainingMoves()<= 0) {
	    // Check if there are vampires alive
	}
	    
	    
	    || dungeon.getRemainingVampires() <=0 || !dungeon.getPlayer().isActive()) {
		break;		
	    }
	
	// 
    }
    public static void main(String[] args) {
	Control control = new Control(20, 20, 20, 10, 10);
	control.run();
    }

}
