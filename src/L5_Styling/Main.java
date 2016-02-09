package L5_Styling;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application{
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Stage window = primaryStage;

	        //GridPane with 10px padding around edge
	        GridPane grid = new GridPane();
	        grid.setPadding(new Insets(10, 10, 10, 10));
	        grid.setVgap(8);
	        grid.setHgap(10);

	        //Name Label - constrains use (child, column, row)
	        Label nameLabel = new Label("Targeting Custom ID");
	        nameLabel.setId("id_name"); //you added an id to this element
	        GridPane.setConstraints(nameLabel, 0, 0);

	        //Name Input
	        TextField nameInput = new TextField("Adding Inline Style");
	        nameInput.setStyle("-fx-background-color:green"); //adding inline style
	        GridPane.setConstraints(nameInput, 1, 0);

	        //Password Label
	        Label passLabel = new Label("Password:");
	        GridPane.setConstraints(passLabel, 0, 1);

	        //Password Input
	        TextField passInput = new TextField();
	        passInput.setPromptText("password");
	        GridPane.setConstraints(passInput, 1, 1);

	        //Login
	        Button loginButton = new Button("Log In");
	        GridPane.setConstraints(loginButton, 1, 2);

	        //Sign up
	        Button signUpButton = new Button("Targeting Custom Class");
	        signUpButton.getStyleClass().add("class_name"); //adding a class
	        GridPane.setConstraints(signUpButton, 1, 3);

	        //Add everything to grid
	        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);

	        Scene scene = new Scene(grid, 300, 200);
	        scene.getStylesheets().add("L5_Styling/custom_style.css");
	        window.setScene(scene);
	        window.show();
	        
	        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
}
