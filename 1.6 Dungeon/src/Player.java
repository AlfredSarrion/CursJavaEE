
public class Player extends Character {

    public Player(int x, int y) {
	super(x,y,'@', true);
    }

    public void inboundCollision(Character character) {
	if (character.getName() == 'V') {
	    // Kill the player
	    super.setActive(false);
	} else {
	    // It's another character, nothing to do
	}
    }
}
