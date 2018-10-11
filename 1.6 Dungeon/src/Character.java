
public abstract class Character {

    private int x;
    private int y;
    private char name;
    private boolean active;
    
    public Character(int x, int y, char name, boolean active) {
	this.x = x;
	this.y = y;
	this.name = name;
	this.active = active;
    }
       
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    
    public void setXY(int x, int y) {
	this.x = x;
	this.y = y;
    }
    
    public boolean equal(int x, int y) {
	if (this.x == x && this.y == y){
	    return true;
	} else {
	    return false;
	}
    }

    public void kill() {
	this.active = false;
    }
    
    public void move(int x, int y, Character destination) {
	if (destination == null) {
	    // No collision, we can move the character to the new place
	    setXY(x,y);
	} else {
	    // Collision, we've to manage it
	    destination.inboundCollision(this);
	}
    }
	
    public abstract void inboundCollision(Character character);

}
