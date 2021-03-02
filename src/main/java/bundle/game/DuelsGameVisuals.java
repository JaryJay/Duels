package bundle.game;

import bundle.visuals.AbstractGameVisuals;
import entity.Player;
import entity.PlayerDisplayer;
import entity.Projectile;
import entity.ProjectileDisplayer;
import state.GameState;

public class DuelsGameVisuals extends AbstractGameVisuals {

	private PlayerDisplayer playerDisplayer;
	private ProjectileDisplayer projectileDisplayer;

	@Override
	public void init() {
		super.init();
		playerDisplayer = new PlayerDisplayer(getBundle().getWrapper().getRenderer());
		projectileDisplayer = new ProjectileDisplayer(getBundle().getWrapper().getRenderer());
	}

	@Override
	public void displayBeforeDisplayables() {
	}

	@Override
	public void displayBeforeGUIS() {
		DuelsGameData data = (DuelsGameData) getBundle().getData();
		System.out.println(data.getStates().size());
		GameState currentState = data.getStates().getLast();
		float alpha = getBundle().getWrapper().getLogicTimer().getAlpha();
		for (Player d : currentState.getPlayers()) {
//			playerDisplayer.display(d);
			playerDisplayer.display(d, alpha);
		}
		for (Projectile p : currentState.getProjectiles()) {
//			projectileDisplayer.display(p);
			projectileDisplayer.display(p, alpha);
		}
	}

	@Override
	public void displayAfterGUIS() {
	}

}
