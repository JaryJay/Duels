package main;

import bundle.DuelsGameBundleWrapper;
import bundle.GameBundleWrapper;
import bundle.input.inputdecorator.GameInputDecorator;
import bundle.visuals.renderer.AbstractGameRenderer;
import common.coordinates.PixelCoordinates;
import engine.GameEnabler;
import engine.ProcessingSketch;
import network.DuelsClient;

public class DuelsApp {

	public static void main(String[] args) {
		new DuelsApp().run();
	}

	private void run() {
		DuelsClient gameClient = new DuelsClient("192.168.0.10");
		Thread networkThread = new Thread(gameClient);
		networkThread.start();

		// Create an window.
		// We use ProcessingSketch in Duels.
		// To use a different window, assign to engine an instance of a different
		// class that implements GameWindow.
		ProcessingSketch window = new ProcessingSketch();

		// Get a renderer from the window.
		// Don't change.
		AbstractGameRenderer renderer = window.getRenderer();

		// Get an input decorator from the window.
		// Don't change.
		GameInputDecorator inputDecorator = window.getInputDecorator();

		// Create a bundle wrapper that holds a bundle. In this case, we use a
		// DuelsGameBundleWrapper.
		// To change, change DuelsGameBundleWrapper to the bundle wrapper
		// of your choice, e.g. NomadsGameBundleWrapper()
		GameBundleWrapper bundleWrapper = new DuelsGameBundleWrapper();

		// Create the game enabler.
		// Don't change.
		GameEnabler enabler = new GameEnabler(window, renderer, inputDecorator, bundleWrapper, "Duel Me Bro", new PixelCoordinates(1600, 900));
		// Run the game enabler.
		// Don't change.
		enabler.enable();
	}

}
