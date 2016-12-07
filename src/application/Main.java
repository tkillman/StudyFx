package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {
	
	static Rectangle[][] rec;
	static Button btn ;
	static int k;
	
	@Override
	public void start(Stage stage) {
		
		
		rec = new Rectangle[25][14];
		
		for(int i=0;i<25;i++){
			for(int j=0;j<14;j++){
				
				if(i ==3 && j ==3){
					rec[i][j] = new Rectangle(20,20,Color.RED); 
					rec[i][j].setStroke(Color.BLACK);
				} else if(i ==3 && j ==4){
					rec[i][j] = new Rectangle(20,20,Color.RED); 
					rec[i][j].setStroke(Color.BLACK);
					
				} else if(i ==3 && j==5){
					rec[i][j] = new Rectangle(20,20,Color.RED); 
					rec[i][j].setStroke(Color.BLACK);
					
				}	else if(i==2 && j==4){
					rec[i][j] = new Rectangle(20,20,Color.RED); 
					rec[i][j].setStroke(Color.BLACK);
				}
				else{
				
				rec[i][j] = new Rectangle(20,20,Color.YELLOW); 
				rec[i][j].setStroke(Color.BLACK);}
				
				
				
			}
		}
		btn = new Button("¹öÆ° 1");
		
		
		
		
		GridPane grid = new GridPane();
		grid.setVgap(1);
		grid.setHgap(1);
		for(int row=0;row<25;row++){
			for(int col=0;col<14;col++){
				
				grid.addRow(row, rec[row][col]);
				
			}
			
		}
		
		
		Pane root = new Pane(grid,btn);
		
		btn.setOnMouseClicked(e->{
			k++;
			
			for(int i=0;i<25;i++){
				for(int j=0;j<14;j++){
					
					if(i ==3+k && j ==3){
						rec[i][j] = new Rectangle(20,20,Color.RED); 
						rec[i][j].setStroke(Color.BLACK);
					} else if(i ==3+k && j ==4){
						rec[i][j] = new Rectangle(20,20,Color.RED); 
						rec[i][j].setStroke(Color.BLACK);
						
					} else if(i ==3+k && j==5){
						rec[i][j] = new Rectangle(20,20,Color.RED); 
						rec[i][j].setStroke(Color.BLACK);
						
					}	else if(i==2+k && j==4){
						rec[i][j] = new Rectangle(20,20,Color.RED); 
						rec[i][j].setStroke(Color.BLACK);
					}
					else{
					rec[i][j] = new Rectangle(20,20,Color.YELLOW); 
					rec[i][j].setStroke(Color.BLACK);}
			
				}
			}
			
			
			
		});
		
		Scene scene = new Scene(root,400,600);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
