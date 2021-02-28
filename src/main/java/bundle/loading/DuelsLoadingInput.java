package bundle.loading;

import java.util.ArrayList;

import bundle.input.AbstractGameInput;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;

public class DuelsLoadingInput extends AbstractGameInput {

	@Override
	protected ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandlers() {
		ArrayList<KeyPressedInputEventHandler> keyPressedInputEventHandlers = new ArrayList<>();
		keyPressedInputEventHandlers.add((event) -> {
			return true;
		});
		return keyPressedInputEventHandlers;
	}

	@Override
	protected ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandlers() {
		ArrayList<KeyReleasedInputEventHandler> keyReleasedInputEventHandlers = new ArrayList<>();
		keyReleasedInputEventHandlers.add((event) -> {
			return true;
		});
		return keyReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandlers() {
		ArrayList<MouseMovedInputEventHandler> mouseMovedInputEventHandlers = new ArrayList<>();
		mouseMovedInputEventHandlers.add((event) -> {
			return true;
		});
		return mouseMovedInputEventHandlers;
	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandlers() {
		ArrayList<MousePressedInputEventHandler> mousePressedInputEventHandlers = new ArrayList<>();
		mousePressedInputEventHandlers.add((event) -> {
			return true;
		});
		return mousePressedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseReleasedInputEventHandler> setMouseReleasedInputHandlers() {
		ArrayList<MouseReleasedInputEventHandler> mouseReleasedInputEventHandlers = new ArrayList<>();
		mouseReleasedInputEventHandlers.add((event) -> {
			// Stop shooting
//			System.out.println("Mouse released!");
			return true;
		});
		return mouseReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseScrolledInputEventHandler> setMouseScrolledInputHandlers() {
		ArrayList<MouseScrolledInputEventHandler> mouseScrolledInputEventHandlers = new ArrayList<>();
		mouseScrolledInputEventHandlers.add((event) -> {
			// Stop shooting
//			System.out.println("Mouse scrolled! " + event.getAmount());
			return true;
		});
		return mouseScrolledInputEventHandlers;
	}

}
