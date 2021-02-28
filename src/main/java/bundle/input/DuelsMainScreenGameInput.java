package bundle.input;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import bundle.GameBundle;
import bundle.data.DuelsGameData;
import bundle.data.DuelsMainScreenGameData;
import bundle.data.gui.TextBox;
import bundle.input.eventhandler.KeyPressedInputEventHandler;
import bundle.input.eventhandler.KeyReleasedInputEventHandler;
import bundle.input.eventhandler.MouseMovedInputEventHandler;
import bundle.input.eventhandler.MousePressedInputEventHandler;
import bundle.input.eventhandler.MouseReleasedInputEventHandler;
import bundle.input.eventhandler.MouseScrolledInputEventHandler;
import bundle.logic.DuelsGameLogic;
import bundle.visuals.DuelsGameVisuals;

public class DuelsMainScreenGameInput extends AbstractGameInput {

	@Override
	protected ArrayList<KeyPressedInputEventHandler> setKeyPressedInputHandlers() {
		ArrayList<KeyPressedInputEventHandler> keyPressedInputEventHandlers = new ArrayList<>();
		keyPressedInputEventHandlers.add((event) -> {
			TextBox textBox = ((DuelsMainScreenGameData) getBundle().getData()).getTextBox();
			int keyCode = event.getKeyCode();
			String text = textBox.getText();
			switch (keyCode) {
				case KeyEvent.VK_BACK_SPACE:
					if (text.length() >= 1) {
						textBox.setText(text.substring(0, text.length() - 1));
					}
					break;
				case KeyEvent.VK_ENTER:
					// Transition to game
					if (text.length() >= 1) {
						GameBundle bundle = new GameBundle(new DuelsGameData(), new DuelsGameInput(), new DuelsGameLogic(), new DuelsGameVisuals());
						getBundle().getWrapper().transition(bundle);
						((DuelsGameData) bundle.getData()).setUsername(text);
					} else {
						// Tell player to enter a name
					}
					break;
				default:
					textBox.setText(text + String.valueOf(Character.toChars(keyCode)));
					break;
			}
			return true;
		});
		return keyPressedInputEventHandlers;
	}

	@Override
	protected ArrayList<KeyReleasedInputEventHandler> setKeyReleasedInputHandlers() {
		ArrayList<KeyReleasedInputEventHandler> keyReleasedInputEventHandlers = new ArrayList<>();
		keyReleasedInputEventHandlers.add((event) -> {
			// Stop moving
			System.out.println("Key released!");
			return true;
		});
		return keyReleasedInputEventHandlers;
	}

	@Override
	protected ArrayList<MouseMovedInputEventHandler> setMouseMovedInputHandlers() {
		ArrayList<MouseMovedInputEventHandler> mouseMovedInputEventHandlers = new ArrayList<>();
		mouseMovedInputEventHandlers.add((event) -> {
			// Change direction
//			System.out.println("Mouse moved!");
			return true;
		});
		return mouseMovedInputEventHandlers;
	}

	@Override
	protected ArrayList<MousePressedInputEventHandler> setMousePressedInputHandlers() {
		ArrayList<MousePressedInputEventHandler> mousePressedInputEventHandlers = new ArrayList<>();
		mousePressedInputEventHandlers.add((event) -> {
			// Shoot
//			System.out.println("Mouse pressed!");
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
