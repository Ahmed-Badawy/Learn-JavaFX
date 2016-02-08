package L3_AlertBoxes;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application{
	

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("thenewboston");
        button = new Button("Click Me");
        
        button.setOnAction(e -> {
        	boolean result = AlertBox.display("Title of Window", "Wow this alert box is awesome!");
        	System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        
        
//this allows you to close from the application & from the nomal windows close button.        
		window.setOnCloseRequest(e->{
			e.consume();
			AppCustomClose(); 
		});

		
    }
    
    
	public void AppCustomClose(){
		System.out.println("This is The Write Close Button.");
		boolean result = AlertBox.display("Close Confirm", "Are you sure you want to close the APP ?");
		if(result) window.close();
	}
	

	
	
}
