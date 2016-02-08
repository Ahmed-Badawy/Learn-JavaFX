package L3_AlertBoxes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	static boolean answer = false;
	
    public static boolean display(String title, String message) {
        Stage window = new Stage();
    	answer = false;

//Block events to other windows. means don't allow control of the first window untill this window is closed. 
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        //Create two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        yesButton.setOnAction(e -> {
        	answer = true;
        	window.close();
        });
        noButton.setOnAction(e -> window.close());

        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
//        window.show();
        window.showAndWait();//show the window & wait unitl it's closed
        
        return answer;
    }

}
