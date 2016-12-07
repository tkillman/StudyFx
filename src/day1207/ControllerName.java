package day1207;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ControllerName implements Initializable {

	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
				
			}
		});
		
		btn2.setOnAction(event->{
			handleBtn2Action(event);
		});
		
		btn3.setOnAction(event->{
			handleBtn3Action(event);
		});
	}
	
	public void handleBtn1Action(ActionEvent event){
		System.out.println("��ư 1 Ŭ��");
		
	}
	public void handleBtn2Action(ActionEvent event){
		System.out.println("��ư 2 Ŭ��");
		
	}
	public void handleBtn3Action(ActionEvent event){
		System.out.println("��ư3 Ŭ��");
		
	}
	public void handleBtn4Action(ActionEvent event){
		System.out.println("��ư4 Ŭ��");
		
	}
}
