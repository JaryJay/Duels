package bundle.loading;

import bundle.data.AbstractGameData;
import bundle.data.gui.GameLabel;
import bundle.visuals.templates.GameBackground;

public class DuelsLoadingData extends AbstractGameData {

	private Long id;

	@Override
	public void init() {
		getToBeDisplayed().add(new GameBackground(20, 20, 20));
		getMainGUI().addChild(new GameLabel("Loading...", 400, 300, 400, 300));
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}