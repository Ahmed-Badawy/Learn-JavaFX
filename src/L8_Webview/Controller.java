package L8_Webview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller implements Initializable {
	@FXML //this is annotation for 
	private WebView webview1;
	private WebEngine eng ;
		
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
        
        eng = webview1.getEngine();
    }

    public void btn1(){
    	eng.load("http://www.google.com");
    }

    public void btn2(){
    	eng.executeScript("alert('hello man');");
    }

    public void btn3(){
    	eng.loadContent("<html><body><h1>hello world man</h1></body></html>");
    } 
    public void btn4(){
    	eng.reload();
    }   
   
    
}
