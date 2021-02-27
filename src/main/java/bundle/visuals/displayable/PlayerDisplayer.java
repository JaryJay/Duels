package bundle.visuals.displayable;

import bundle.visuals.display.AbstractDisplayer;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.Vector2f;

public class PlayerDisplayer extends AbstractDisplayer<Player> {

	public PlayerDisplayer(AbstractGameRenderer renderer) {
		super(renderer);
	}

	@Override
	public void display(Player displayable) {
		Vector2f position = displayable.getPosition();
		Vector2f direction = displayable.getDirection();
		renderer.fill(150, 150, 150);
		renderer.drawEllipse(position.x, position.y, Player.HITBOX_RADIUS, Player.HITBOX_RADIUS);
	}

}
