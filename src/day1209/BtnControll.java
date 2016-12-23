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
		btnLogin.setOnAction(e->handleBtnLogin(e)); //��ư Ŭ���� �޼ҵ� ȣ��

	}

	public void handleBtnLogin(ActionEvent event){
		
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));//  login.fxml�� �ҷ��ͼ� login�� ����
			StackPane root = (StackPane)btnLogin.getScene().getRoot(); // ���� ȭ��
			root.getChildren().add(login); // ���� ȭ�鿡 ���ο� login ȭ���� ����.
			
			login.setTranslateX(350);
			Timeline timeline = new Timeline(); // timeline ����
			KeyValue keyValue = new KeyValue(login.translateXProperty(),0); // //login�� ȭ�� 350���� 0������ �����δ�.
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100) , keyValue);
			//0.1�ʸ��� keyValue�� �����Ų��.
			
			timeline.getKeyFrames().add(keyFrame); // 
			timeline.play();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
