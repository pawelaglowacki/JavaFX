package imgViewer;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

 public class MainImageViewer extends Application {

     @Override public void start(Stage stage) throws IOException {

    	 	stage.setTitle("Stage title");

			Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

			Scene scene = new Scene(root);

	        stage.setScene(scene);

	        //scene.getStylesheets().add(App.class.getResource("fancy.css").toExternalForm());

	        stage.show();

     }

     public static void main(String[] args) {
         Application.launch(args);
     }
 }
