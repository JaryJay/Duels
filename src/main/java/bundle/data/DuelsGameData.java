package bundle.data;

import java.util.Queue;

import common.util.LimitedQueue;
import state.GameState;

public class DuelsGameData extends AbstractGameData {

	private Queue<GameState> states;
	private String username;

	@Override
	public void init() {
		states = new LimitedQueue<>(30);
		states.add(new GameState(System.currentTimeMillis()));
	}

	public Queue<GameState> getStates() {
		return states;
	}

	public void setStates(Queue<GameState> states) {
		this.states = states;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}