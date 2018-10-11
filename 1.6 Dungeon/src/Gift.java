
public class Gift extends Character {

    public Gift(int x, int y) {
	super(x,y,'G', true);
    }

    @Override    
    public void move(int x, int y, Character destination) {
	// Do nothing
    }

    public void inboundCollision(Character character) {
	if (character.getName() == '@') {
	    // Gift picked
	    super.setActive(false);
	} else {
	    // It's another character, nothing to do, movement not allowed
	}
    }
}
