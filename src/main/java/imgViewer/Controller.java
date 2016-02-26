package imgViewer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;

public class Controller implements Initializable {

	@FXML
	ImageView mainImage;

	@FXML
	Button button;

	@FXML
	Button plusButton;

	@FXML
	Button minusButton;

	@FXML
	Button btn;

	public void handleButtonActionShowSloths(ActionEvent event) {
		System.out.println("Sloths");
	}

	public void initialize(URL location, ResourceBundle resources) {

	    mainImage.setImage(new Image("fw2.jpg"));

		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				System.out.println("You clicked me!");
			}
		});

		plusButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				mainImage.setFitWidth(1000);
				mainImage.setFitHeight(1000);
			}
		});

		minusButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				mainImage.setFitWidth(100);
				mainImage.setFitHeight(100);
			}
		});

		btn.setOnAction(new EventHandler<ActionEvent>() {

			Label labelFile = new Label();

			@Override
			public void handle(ActionEvent event) {

				DirectoryChooser directoryChooser = new DirectoryChooser();
				directoryChooser.setTitle("This is my directory chooser");
				// Show open file dialog
				File file = directoryChooser.showDialog(null);

				if(file != null){
					labelFile.setText(file.getPath());
				}
			}
		});
	}
}