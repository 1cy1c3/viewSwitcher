package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.HelpModel;

/**
 * Controller regarding Mapping the elements of /view/help.fxml
 * 
 * @author Rune Krauss
 * 
 */
public class HelpController implements Initializable {
	private HelpModel helpModel;
	
	@FXML
	private TextArea textArea_help_about;

	/**
	 * Initializes this controller with its data
	 */
	public void initialize(URL arg0, ResourceBundle arg1) {
		setTextArea();
	}
	
	/**
	 * Sets text in the text area
	 */
	void setTextArea() {
		textArea_help_about.setText("That is the help.\nSwitching was successful.");
	}
}