package bundle.data;

import java.util.ArrayList;
import java.util.List;

import bundle.visuals.displayable.Player;
import common.entity.Projectile;

public class GameState {

	private List<Player> players;
	private List<Projectile> projectiles;

	public void init() {
		players = new ArrayList<>();
	}

}
