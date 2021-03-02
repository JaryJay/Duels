package bundle.game;

import bundle.logic.AbstractGameLogic;
import input.InputFrame;
import misc.LimitedQueue;
import state.GameState;

public class DuelsGameLogic extends AbstractGameLogic {

	private boolean addNewFrame = true;

	@Override
	public void update() {
		if (addNewFrame) {
			DuelsGameData data = (DuelsGameData) getBundle().getData();
			LimitedQueue<GameState> states = data.getStates();
			states.add(states.getLast().getNextState(new InputFrame()));
		}
	}

}
