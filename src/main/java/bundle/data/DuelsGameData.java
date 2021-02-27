package bundle.data;

import java.util.Queue;

import common.util.LimitedQueue;

public class DuelsGameData extends AbstractGameData {

	private Queue<GameState> states;

	@Override
	public void init() {
		states = new LimitedQueue<>(30);
		states.add(new GameState());
	}

}