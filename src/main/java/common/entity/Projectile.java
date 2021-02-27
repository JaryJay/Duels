package common.entity;

import common.coordinates.Vector2f;

public class Projectile extends AbstractEntity {

	private Vector2f position;
	private Vector2f velocity;

	public Projectile(long id) {
		super(id);
	}

	public Vector2f getPosition() {
		return position;
	}

	public Vector2f getVelocity() {
		return velocity;
	}

}
