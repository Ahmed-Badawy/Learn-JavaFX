package L1;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent>{
	
	
	Button btn;
	Stage window;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			window = primaryStage;
			
//set the window title
			window.setTitle("Application Title Here");
			
			StackPane root = new StackPane();
//			BorderPane root = new BorderPane();
			
			btn = new Button("Click Me");//created a button
			Button btn2 = new Button("button 2");
			Button btn3 = new Button("button 3");
			
//adding event handler way
//1: implementing EventHandler then adding the handling method
			btn.setOnAction(this);
//2: adding it normally 
			btn2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println("inline event handling");
				}
			});
//3: you can do it the lamda eveprition way:
			btn3.setOnAction(e->System.out.println("lamda exp way"));
			
			
			root.getChildren().addAll(btn,btn2,btn3); //adding button to the view
//			root.getChildren().add(btn2);
//			root.getChildren().add(btn3);

			Scene scene = new Scene(root,800,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == btn) {
			btn.setText("Button Was Clicked"); 
			System.out.println("hello world");
		}
	}
	
	

	
	
	
	
	
	

	
	
	
	
}
