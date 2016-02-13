package L7_FXML;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("layout1.fxml"));
	        primaryStage.setTitle("Hello World");
	        
	        Scene scene = new Scene(root, 300, 275);
	        
//	        scene.getStylesheets().add("L7_FXML/custom_style.css");
	        scene.getStylesheets().add(getClass().getResource("custom_style.css").toExternalForm());

	        primaryStage.setScene(scene);
	        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
}
