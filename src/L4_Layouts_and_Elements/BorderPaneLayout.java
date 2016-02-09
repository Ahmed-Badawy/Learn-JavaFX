package L4_Layouts_and_Elements;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneLayout {

    public static void display() {
        Stage window = new Stage();
        
        HBox topmenu = new HBox();
        Button btn1 = new Button("File");
        Button btn2 = new Button("Edit");
        Button btn3 = new Button("View");
        topmenu.getChildren().addAll(btn1,btn2,btn3);
        
        VBox leftmenu = new VBox();
        Button btn4 = new Button("Button one");
        Button btn5 = new Button("Button two");
        Button btn6 = new Button("Button three");
        leftmenu.getChildren().addAll(btn4,btn5,btn6);

        BorderPane layout = new BorderPane();
        layout.setTop(topmenu);
        layout.setLeft(leftmenu);

		Scene scene = new Scene(layout,800,400);
        window.setScene(scene);
        window.setTitle("Application Title");
        window.show();
    }

}
