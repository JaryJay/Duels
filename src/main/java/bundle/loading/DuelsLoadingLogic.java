package bundle.loading;

import bundle.GameBundle;
import bundle.game.DuelsGameData;
import bundle.game.DuelsGameInput;
import bundle.game.DuelsGameLogic;
import bundle.game.DuelsGameVisuals;
import bundle.logic.AbstractGameLogic;
import state.GameState;

public class DuelsLoadingLogic extends AbstractGameLogic {

	@Override
	public void update() {
		GameBundle bundle = getBundle();
		DuelsLoadingData data = (DuelsLoadingData) bundle.getData();
		GameState state = data.getState();
		if (data.getId() != null && state != null) {
			DuelsGameData newData = new DuelsGameData(data.getId());
			GameBundle gameBundle = new GameBundle(newData, new DuelsGameInput(), new DuelsGameLogic(), new DuelsGameVisuals());
			bundle.getWrapper().transition(gameBundle);
			newData.getStates().add(state);
		}
	}

}