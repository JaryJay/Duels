package bundle.data.gui;

public class TextBox extends AbstractGUI {

	private boolean selected;

	public TextBox(int x, int y, int width, int height) {
		super("", x, y, width, height);
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

}
