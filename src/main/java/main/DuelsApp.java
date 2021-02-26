package main;

import bundle.DuelsGameBundleWrapper;
import bundle.GameBundleWrapper;
import engine.GameEnabler;
import engine.ProcessingSketch;

public class DuelsApp {

	public static void main(String[] args) {
		new DuelsApp().run();
	}

	private void run() {
		ProcessingSketch window = new ProcessingSketch();
		GameBundleWrapper wrapper = new DuelsGameBundleWrapper();
		GameEnabler enabler = new GameEnabler(window, window.getRenderer(), null, wrapper, "");
		enabler.enable();
	}

}
