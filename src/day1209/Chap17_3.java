package day1209;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Chap17_3 extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		
 
		
		Parent root = FXMLLoader.load(getClass().getResource("Chap17_3.fxml"));
		
		/*Button btn = new Button();
		btn.setText("버튼 1");*/
		
		
		
		/*ComboBox<String> com = new ComboBox<String>();
		com.setItems(FXCollections.observableArrayList("감","자"));*/
		
		
		StackPane pane = new StackPane(root);
		Scene scene = new Scene(pane,800,500);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
	
	

}
