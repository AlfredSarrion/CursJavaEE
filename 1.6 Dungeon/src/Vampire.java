
public class Vampire extends Character {

    public Vampire(int x, int y) {
	super(x,y,'V', true);
    }

    public void inboundCollision(Character character) {
	if (character.getName() == '@') {
	    // Kill the vampire
	    super.setActive(false);
	} else {
	    // It's another character, nothing to do. movement not allowed
	}
    }
}
