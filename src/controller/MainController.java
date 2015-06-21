package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

/**
 * Controller regarding Mapping the elements of /view/main.fxml
 * 
 * @author Rune Krauss
 * 
 */
public class MainController {
	@FXML
	private StackPane viewContainer;

	public void setView(Node node) {
		viewContainer.getChildren().setAll(node);
	}

	@FXML
	public void menuItem_main_close_onAction(ActionEvent event) {
		Platform.exit();
	}
	
	@FXML
	public void menuItem_main_greeting_onAction(ActionEvent event) {
		ViewController.loadView(ViewController.WELCOME);
	}
	
	@FXML
	public void menuItem_main_about_onAction(ActionEvent event) {
		ViewController.loadView(ViewController.HELP);
	}
}