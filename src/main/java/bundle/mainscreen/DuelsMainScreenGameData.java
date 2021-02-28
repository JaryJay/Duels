package bundle.mainscreen;

import bundle.TextBox;
import bundle.data.AbstractGameData;
import bundle.visuals.templates.GameBackground;

public class DuelsMainScreenGameData extends AbstractGameData {

	private TextBox textBox;

	@Override
	public void init() {
		getToBeDisplayed().add(new GameBackground(255, 255, 255));
		textBox = new TextBox(200, 400, 1200, 120);
		textBox.setOutlineR(0);
		textBox.setOutlineG(0);
		textBox.setOutlineB(0);
		getMainGUI().addChild(textBox);
	}

	public TextBox getTextBox() {
		return textBox;
	}

}
