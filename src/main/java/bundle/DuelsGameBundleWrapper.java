package bundle;

import bundle.mainscreen.DuelsMainScreenGameData;
import bundle.mainscreen.DuelsMainScreenGameInput;
import bundle.mainscreen.DuelsMainScreenGameLogic;
import bundle.mainscreen.DuelsMainScreenGameVisuals;

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
