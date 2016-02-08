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
        Button btn3 = new Button("VBox With Checkboxes");
        Button btn4 = new Button("Tree View");
        Button btn5 = new Button("Table View");
        Button btn6 = new Button("Creating Menus");

        btn1.setOnAction(e ->BorderPaneLayout.display());
        btn2.setOnAction(e ->GridPaneLayout.display());
        btn3.setOnAction(e ->VBoxCheckboxes.display());
        btn4.setOnAction(e ->TreeViewViewing.display());
        btn5.setOnAction(e ->TableViewing.display());
        btn6.setOnAction(e ->CreatingMenus.display());

        VBox layout = new VBox();
        layout.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        		
    }
    


	
	
}
