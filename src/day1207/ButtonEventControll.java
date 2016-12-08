package day1207;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonEventControll implements Initializable{
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checklmageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radiolmageView ;
	@FXML private Button btnExit;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		
		public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue){
		Image image = new Image(getClass().getResource(newValue.getUserData().toString()+".png")).toString();	
			
			
		}
		
		});
		
	}

		

}
