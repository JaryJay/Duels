package bundle.game;

import bundle.data.AbstractGameData;
import bundle.visuals.templates.GameBackground;
import misc.LimitedQueue;
import state.GameState;

public class DuelsGameData extends AbstractGameData {

	private LimitedQueue<GameState> states;
	private long id;

	public DuelsGameData(Long id) {
		this.id = id;
	}

	@Override
	public void init() {
		getToBeDisplayed().add(new GameBackground(0, 180, 0));
		states = new LimitedQueue<>(30);
	}

	public LimitedQueue<GameState> getStates() {
		return states;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}