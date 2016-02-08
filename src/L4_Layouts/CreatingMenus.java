package L4_Layouts;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreatingMenus {
	  
    public static void display() {
        Stage window = new Stage();
        window.setTitle("Table View");

        
        
        //Layout
        VBox layout = new VBox();
//        layout.getChildren().addAll(table,hBox);
        Scene scene = new Scene(layout, 800, 600);
        window.setScene(scene);
        window.show();
    }



    
    
	
}
