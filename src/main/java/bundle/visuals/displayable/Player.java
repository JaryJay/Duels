package bundle.visuals.displayable;

import bundle.visuals.display.Displayable;
import common.coordinates.Vector2f;
import common.entity.AbstractEntity;

public class Player extends AbstractEntity implements Displayable {

	public static final int MAX_HEALTH = 100;
	public static final int HITBOX_RADIUS = 10;

	private Vector2f position;
	private Vector2f direction;

	private int health;

	public Player(long id) {
		super(id);
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getDirection() {
		return direction;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
