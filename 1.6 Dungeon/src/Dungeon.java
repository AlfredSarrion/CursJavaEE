import java.util.ArrayList;
import java.util.Random;

public class Dungeon {

    private int lenght;
    private int height;
    
    private int remainingMoves;
    private Player player;
    private ArrayList<Character> characters;
    
    public Dungeon(int lenght, int height, int moves,int vampires, int gifts) {
	
	this.remainingMoves = moves;
	this.lenght = lenght;
	this.height = height;
	
	this.player = new Player(0,0);
	this.characters = new ArrayList<Character>();

	for (int i = 1;i<vampires;i++) {
	    this.characters.add(new Vampire(0,0));
	}
	for (int i = 1;i<gifts;i++) {
	    this.characters.add(new Gift(0,0));
	}

    }

    public int getRemainingMoves() {
        return remainingMoves;
    }

    public void setRemainingMoves(int remainingMoves) {
        this.remainingMoves = remainingMoves;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
    
    
    public int decreaseMoves() {
	this.remainingMoves--;
	return this.remainingMoves;
    }
    

    public int getRemainingVampires() {
	int totalVampires = 0;
	for (Character character:characters) {
	    if (character.getName() == 'V' && character.isActive()) {
		totalVampires++;
	    }
	}
	return totalVampires;
    }
    
    public void addCharacter(Character character) {
	this.characters.add(character);
    }
    
    public void moveCharacters() {

	for (Character origin:characters) {

	    // Generate new random destination
	    int x = getRandomLocation(lenght);
	    int y = getRandomLocation(height);
	    
	    // Get the destination, it can be null or an existing character
	    Character destination = getDestination(x,y); 

	    // Now we can move from the origin to the destination
	    origin.move(x, y, destination);
	}
    }
    
    public Character getDestination(int x, int y) {

	// First we'll check the player position
	if (player.equal(x, y)) {
	    return player;
	} else {
	    // Now we can check the characters
	    for (Character character:characters) {
		if (character.equal(x, y) && character.isActive()) {
		    return character;
		}
	    }
	}
	return null;
    }
    
    public int getRandomLocation(int max) {
	return (int) (Math.random() * max);
    }
}
