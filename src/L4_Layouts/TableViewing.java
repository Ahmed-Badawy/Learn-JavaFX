package L4_Layouts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewing {
	 
	  static TableView<product_model> table;
	  static TextField nameInput, priceInput, quantityInput;
	    
	  
	 
    public static void display() {
        Stage window = new Stage();
        window.setTitle("Table View");

        //Name column
        TableColumn<product_model, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //Price column
        TableColumn<product_model, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<product_model, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        
        //Name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);

        //Price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");

        //Quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quantity");

        //Button
        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
        
        table = new TableView<>();
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
        table.setItems(getProduct());

        //Layout
        VBox layout = new VBox();
        layout.getChildren().addAll(table,hBox);
        Scene scene = new Scene(layout, 800, 600);
        window.setScene(scene);
        window.show();
    }


    //Get all of the products
    public static ObservableList<product_model> getProduct(){
        ObservableList<product_model> products = FXCollections.observableArrayList();
        products.add(new product_model("Laptop", 859.00, 20));
        products.add(new product_model("Bouncy Ball", 2.49, 198));
        products.add(new product_model("Toilet", 99.00, 74));
        products.add(new product_model("The Notebook DVD", 19.99, 12));
        products.add(new product_model("Corn", 1.49, 856));
        return products;
    }
    

    
    
    //Add button clicked
    public static void addButtonClicked(){
    	product_model product = new product_model();
        product.setName(nameInput.getText());
        product.setPrice(Double.parseDouble(priceInput.getText()));
        product.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(product);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }
   
    //Delete button clicked
    public static void deleteButtonClicked(){
        ObservableList<product_model> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems(); 
        productSelected.forEach(allProducts::remove);
    }
    

    
    
    
    
	
}
