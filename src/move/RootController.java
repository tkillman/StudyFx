package move;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {

	@FXML Button btnLogin;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		btnLogin.setOnAction(e->{
			
			try {
				
				Parent root= FXMLLoader.load(getClass().getResource("login.fxml"));
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
			
			
		});
		
		
		
	}

}
