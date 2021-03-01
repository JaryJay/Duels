package bundle.game;

import bundle.visuals.AbstractGameVisuals;
import state.GameState;

public class DuelsGameVisuals extends AbstractGameVisuals {

	@Override
	public void displayBeforeDisplayables() {
		DuelsGameData data = (DuelsGameData) getBundle().getData();
		GameState currentState = data.getStates().getLast();
		data.getToBeDisplayed().addAll(currentState.getPlayers());
	}

	@Override
	public void displayBeforeGUIS() {
		DuelsGameData data = (DuelsGameData) getBundle().getData();
		GameState currentState = data.getStates().getLast();
		data.getToBeDisplayed().removeAll(currentState.getPlayers());
	}

	@Override
	public void displayAfterGUIS() {
	}

}
