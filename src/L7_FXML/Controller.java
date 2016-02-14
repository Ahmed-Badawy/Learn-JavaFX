package L7_FXML;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class Controller implements Initializable {
	@FXML //this is annotation for 
	
	public Button btn1;
	
	
	public ListView<String> listview1;
	
	public ComboBox<String> combo;
	ObservableList<String> ob_list = FXCollections.observableArrayList("One","Two","three");
	String[] dynamic_add_list = {"dynamic add 1","dynamic add 2","dynamic add 3"};
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
       
        //Combo Boxes
        combo.setItems(ob_list); //way one: add from ovservable list
        combo.getItems().addAll(dynamic_add_list); //way two: dynamic add strings
        
        //List Views
      	listview1.setItems(ob_list); //way one: add from ovservable list
        listview1.getItems().addAll(dynamic_add_list); //way two: dynamic add strings
        listview1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//permit multiple selections
    }
    
    public void btn_clicked(){
    	System.out.println("Button Was Clicked !");
    }

    public void method_two(){
    	System.out.println("this is method two");
    }
    
    
}
