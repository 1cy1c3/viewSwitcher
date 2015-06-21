import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

import controller.MainController;
import controller.ViewController;

/**
 * Class for initializing this framework
 * 
 * @author Rune Krauss
 * 
 */
public class App extends Application {
	private static String STYLE_PATH = "/res/css/";

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("ViewSwitcher");

		stage.setScene(createScene(loadMainPane()));

		stage.show();
	}

	/**
	 * Loads the main pane and the first view
	 * 
	 * @return Main pane
	 * @throws IOException
	 */
	private Pane loadMainPane() throws IOException {
		FXMLLoader loader = new FXMLLoader();

		Pane mainPane = (Pane) loader.load(getClass().getResourceAsStream(
				"/view/" + ViewController.MAIN));

		MainController mainController = loader.getController();

		ViewController.setLanguageBundle();
		ViewController.setMainController(mainController);
		ViewController.loadView(ViewController.WELCOME);

		return mainPane;
	}

	/**
	 * Creates a scene and sets the style sheet
	 * 
	 * @param mainPane Wrapper of the views
	 * @return Scene
	 */
	private Scene createScene(Pane mainPane) {
		Scene scene = new Scene(mainPane);

		scene.getStylesheets().setAll(
				getClass().getResource(STYLE_PATH + "style.css")
						.toExternalForm());

		return scene;
	}

	/**
	 * Starting point of this application
	 * @param args Command line parameters
	 */
	public static void main(String[] args) {
		launch(args);
	}
}