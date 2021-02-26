package bundle.visuals.displayable;

import bundle.visuals.display.Displayable;
import common.coordinates.Vector2f;
import common.entity.User;

public class Player extends User implements Displayable {

	private Vector2f position;
	private Vector2f direction;

	public Player(String username, int id) {
		super(username, id);
	}

	public Vector2f getPosition() {
		return position;
	}

	public void setPosition(Vector2f position) {
		this.position = position;
	}

	public Vector2f getDirection() {
		return direction;
	}

	public void setDirection(Vector2f direction) {
		this.direction = direction;
	}

}
