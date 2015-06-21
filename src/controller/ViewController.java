package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Controller for holding the views and its switching
 * 
 * @author Rune Krauss
 * 
 */
public class ViewController {

	/**
	 * Resource bundle regarding i18n
	 */
	private static ResourceBundle bundle;
	
	/**
	 * Path of the view
	 */
	private static String VIEW_PATH = "/view/";
	
	/**
	 * Path of the bundles
	 */
	private static String BUNDLE_PATH = "res.bundles.";

	/**
	 * Filename regarding the MainController
	 */
	public static final String MAIN = "main.fxml";
	
	/**
	 * Filename regarding the WelcomeController
	 */
	public static final String WELCOME = "welcome.fxml";
	
	/**
	 * Filename regarding the HelpController
	 */
	public static final String HELP = "help.fxml";

	/**
	 * Instance of the MainController
	 */
	private static MainController mainController;

	/**
	 * Checks which language is present and sets them
	 */
	public static void setLanguageBundle() {
		if (System.getProperty("user.language").equals("de")) {
			bundle = ResourceBundle.getBundle("res.bundles.bundle",
					Locale.forLanguageTag("de"));
		} else {
			bundle = ResourceBundle.getBundle(BUNDLE_PATH + "bundle",
					Locale.forLanguageTag("en"));
		}
	}

	/**
	 * Sets the MainController
	 * @param mainController MainController
	 */
	public static void setMainController(MainController mainController) {
		ViewController.mainController = mainController;
	}

	/**
	 * Loads a new view (switching)
	 * @param fxml Respective View
	 */
	public static void loadView(String fxml) {
		try {
			mainController.setView((Node) FXMLLoader.load(
					ViewController.class.getResource(VIEW_PATH + fxml),
					bundle));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}