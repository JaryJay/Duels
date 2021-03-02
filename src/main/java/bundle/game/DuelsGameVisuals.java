package bundle.game;

import bundle.visuals.AbstractGameVisuals;
import entity.Player;
import entity.PlayerDisplayer;
import state.GameState;

public class DuelsGameVisuals extends AbstractGameVisuals {

	private PlayerDisplayer playerDisplayer;

	@Override
	public void init() {
		super.init();
		playerDisplayer = new PlayerDisplayer(getBundle().getWrapper().getRenderer());
	}

	@Override
	public void displayBeforeDisplayables() {
	}

	@Override
	public void displayBeforeGUIS() {
		DuelsGameData data = (DuelsGameData) getBundle().getData();
		GameState currentState = data.getStates().getLast();
		for (Player d : currentState.getPlayers()) {
			playerDisplayer.display(d);
		}
	}

	@Override
	public void displayAfterGUIS() {
	}

}
