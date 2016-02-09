package L6_Binding;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application{
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Stage window = primaryStage;
			window.setTitle("Binding Values");
			
			
	        //GridPane with 10px padding around edge
	        GridPane grid = new GridPane();
	        grid.setPadding(new Insets(10, 10, 10, 10));
	        grid.setVgap(8);
	        grid.setHgap(10);

	        //Name Input
	        TextField bind_textfield = new TextField("Bindable Text");
	        GridPane.setConstraints(bind_textfield, 0, 0);

	        Label bind_label = new Label("Bind Label");
	        GridPane.setConstraints(bind_label, 1, 0);

	        
	        //Add everything to grid
	        grid.getChildren().addAll(bind_textfield,bind_label);

	        Scene scene = new Scene(grid, 600, 200);
	        window.setScene(scene);
	        window.show();
	        

	        bind_label.textProperty().bind(bind_textfield.textProperty());	        


	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
}
