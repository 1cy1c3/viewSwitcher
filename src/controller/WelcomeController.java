package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * Controller regarding Mapping the elements of /view/help.fxml
 * 
 * @author Rune Krauss
 * 
 */
public class WelcomeController implements Initializable {
	@Override
	public void initialize(URL location, ResourceBundle resources) {}
	
	@FXML
	public void button_welcome_help_onAction(ActionEvent event) throws IOException {
		ViewController.loadView(ViewController.HELP);
	}
}