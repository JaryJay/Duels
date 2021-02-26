package bundle;

import bundle.data.DuelsGameData;
import bundle.input.DuelsGameInput;
import bundle.logic.DuelsGameLogic;
import bundle.visuals.DuelsGameVisuals;

public class DuelsGameBundleWrapper extends GameBundleWrapper {

	public DuelsGameBundleWrapper() {
		super(new GameBundle(new DuelsGameData(), new DuelsGameInput(), new DuelsGameLogic(), new DuelsGameVisuals()));
//		DuelsGameData data = new DuelsGameData();
//		DuelsGameInput input = new DuelsGameInput();
//		DuelsGameLogic logic = new DuelsGameLogic();
//		DuelsGameVisuals visuals = new DuelsGameVisuals();
//		GameBundle bundle = new GameBundle(data, input, logic, visuals);
	}

}
