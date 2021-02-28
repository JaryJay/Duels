package bundle;

import bundle.data.DuelsMainScreenGameData;
import bundle.input.DuelsMainScreenGameInput;
import bundle.logic.DuelsMainScreenGameLogic;
import bundle.visuals.DuelsMainScreenGameVisuals;

public class DuelsGameBundleWrapper extends GameBundleWrapper {

	public DuelsGameBundleWrapper() {
		super(new GameBundle(new DuelsMainScreenGameData(), new DuelsMainScreenGameInput(), new DuelsMainScreenGameLogic(), new DuelsMainScreenGameVisuals()));
//		DuelsGameData data = new DuelsGameData();
//		DuelsGameInput input = new DuelsGameInput();
//		DuelsGameLogic logic = new DuelsGameLogic();
//		DuelsGameVisuals visuals = new DuelsGameVisuals();
//		GameBundle bundle = new GameBundle(data, input, logic, visuals);
	}

}
