package L4_Layouts;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxCheckboxes {
	
    static String[] StringArray = {"one","two","three","four","five","six"};

    public static void display() {
        Stage window = new Stage();

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(40,40,40,40));

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true); //selected by default

        
        ChoiceBox<String> choiceBox = new ChoiceBox<>(); 
        choiceBox.getItems().addAll(StringArray);
        choiceBox.setValue("two"); //set default
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v,oldvalue,newvalue)->System.out.println("User selected "+newvalue) );
        
        
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(StringArray);
        comboBox.setPromptText("What is your favorite movie?");
//ComboBoxes also generate actions if you need to get value instantly
        comboBox.setOnAction( e -> System.out.println("User selected " + comboBox.getValue()) );

        
        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(StringArray);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //allow Multible Selection
        
        
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> handleOptions(box1,box2,listView));
        
        
        layout.getChildren().addAll(box1,box2,choiceBox,comboBox,listView,submitButton);
        
		Scene scene = new Scene(layout,800,800);
        window.setScene(scene);
        window.setTitle("Application Title");
        window.show();
        
    }
    
    
    //Handle checkbox options
    private static void handleOptions(CheckBox box1, CheckBox box2, ListView<String> listView){
        String message = "Users order:\n";

        if(box1.isSelected())
            message += "Bacon\n";

        if(box2.isSelected())
            message += "Tuna\n";
        
        ObservableList<String> movies = listView.getSelectionModel().getSelectedItems();
        message += movies.toString();

        System.out.println(message);
    }

}
