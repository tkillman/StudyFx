package day1209;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class BtnControll implements Initializable {
	@FXML private Button btnLogin;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e->handleBtnLogin(e)); //버튼 클릭시 메소드 호출

	}

	public void handleBtnLogin(ActionEvent event){
		
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));//  login.fxml을 불러와서 login에 담음
			StackPane root = (StackPane)btnLogin.getScene().getRoot(); // 원래 화면
			root.getChildren().add(login); // 원래 화면에 새로운 login 화면을 띄운다.
			
			login.setTranslateX(350);
			Timeline timeline = new Timeline(); // timeline 생성
			KeyValue keyValue = new KeyValue(login.translateXProperty(),0); // //login의 화면 350값을 0값까지 움직인다.
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100) , keyValue);
			//0.1초마다 keyValue를 실행시킨다.
			
			timeline.getKeyFrames().add(keyFrame); // 
			timeline.play();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
