package day1207;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listen extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("ListenControll.fxml"));
				
				Parent root =(Parent)loader.load(); 
				
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.setResizable(false);
				stage.show();
				
			
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
