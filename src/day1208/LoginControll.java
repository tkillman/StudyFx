package day1208;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginControll implements Initializable {
	@FXML private BorderPane login;
	@FXML private Button btnMain;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));

	}

	public void handleBtnMain(ActionEvent event){
		try {
			StackPane root= (StackPane)btnMain.getScene().getRoot();
			root.getChildren().remove(login);
			login.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					root.getChildren().remove(login);
					
				} 
			}, keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
