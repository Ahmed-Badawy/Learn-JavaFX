package L4_Layouts;
	
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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Layouts");
        Button btn1 = new Button("BorderPane,HBox,VBox");
        Button btn2 = new Button("GridPane");

        btn1.setOnAction(e ->BorderPaneLayout.display());
        btn2.setOnAction(e ->GridPaneLayout.display());

        VBox layout = new VBox();
        layout.getChildren().addAll(btn1,btn2);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        		
    }
    


	
	
}
