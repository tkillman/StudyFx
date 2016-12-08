package day1208;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MoveScene extends Application {

	
	@Override
	public void start(Stage stage) throws Exception {
	
		
		Parent root = FXMLLoader.load(MoveScene.class.getResource("MoveScene.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setWidth(350);
		stage.setHeight(500);
		stage.setResizable(false);
		
		
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
