package day1209;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Chap17_4 extends Application{
	
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		
 
		
		Parent root = FXMLLoader.load(getClass().getResource("Chap17_4.fxml"));
		
		
		StackPane pane = new StackPane(root);
		Scene scene = new Scene(pane,800,500);
		stage.setScene(scene);
		stage.show();
		
	}
	
		public static void main(String[] args) {
			launch(args);
		}
}
