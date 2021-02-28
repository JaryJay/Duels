package bundle.loading;

import bundle.GameBundle;
import bundle.game.DuelsGameData;
import bundle.game.DuelsGameInput;
import bundle.game.DuelsGameLogic;
import bundle.game.DuelsGameVisuals;
import bundle.logic.AbstractGameLogic;

public class DuelsLoadingLogic extends AbstractGameLogic {

	@Override
	public void update() {
		GameBundle bundle = getBundle();
		if (((DuelsLoadingData) bundle.getData()).getId() != null) {
			GameBundle gameBundle = new GameBundle(new DuelsGameData(((DuelsLoadingData) bundle.getData()).getId()), new DuelsGameInput(), new DuelsGameLogic(), new DuelsGameVisuals());
			bundle.getWrapper().transition(gameBundle);

		}
	}

}