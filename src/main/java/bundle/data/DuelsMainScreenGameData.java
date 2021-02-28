package bundle.data;

import bundle.data.gui.TextBox;

public class DuelsMainScreenGameData extends AbstractGameData {

	private TextBox textBox;

	@Override
	public void init() {
		textBox = new TextBox(200, 400, 1200, 120);
		getMainGUI().addChild(textBox);
	}

	public TextBox getTextBox() {
		return textBox;
	}

}
