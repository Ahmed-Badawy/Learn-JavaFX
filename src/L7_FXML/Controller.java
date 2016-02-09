package L7_FXML;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Controller implements Initializable {
	
	public Button btn1;
	
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }
    
    public void btn_clicked(){
    	System.out.println("Button Was Clicked !");
    }

    
}
