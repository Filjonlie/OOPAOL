package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scn2Controller implements Initializable{
	@FXML
    private Spinner<Integer> combo1;

    @FXML
    private Spinner<Integer> combo2;

    @FXML
    private Spinner<Integer> combo3;

    @FXML
    private Spinner<Integer> combo4;
    
    int hold;
    int hold2;
    int hold3;
    int hold4;
    int total;
    
    private Stage stage;
	private Scene scene;
	private Parent root;
    
    public void initialize(URL arg0,ResourceBundle arg1) {
    	SpinnerValueFactory<Integer> valueFactory =
    			new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
    	SpinnerValueFactory<Integer> valueFactory2 =
    			new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
    	SpinnerValueFactory<Integer> valueFactory3 =
    			new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
    	SpinnerValueFactory<Integer> valueFactory4 =
    			new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
    	valueFactory.setValue(0);
    	combo1.setValueFactory(valueFactory);
    	combo2.setValueFactory(valueFactory2);
    	combo3.setValueFactory(valueFactory3);
    	combo4.setValueFactory(valueFactory4);
    }

    @FXML
    void orderCombo(ActionEvent event) throws IOException{
    	hold = combo1.getValue();
    	hold2 = combo2.getValue();
    	hold3 = combo3.getValue();
    	hold4 = combo4.getValue();
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Checkout.fxml"));
    	root = loader.load();
    	CheckoutController checkoutController = loader.getController();
    	checkoutController.display(hold, hold2, hold3, hold4);
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
//    	System.out.println("Total Order: ");
//    	System.out.println(+hold+" Combo 1");
//    	System.out.println(+hold2+" Combo 2");
//    	System.out.println(+hold3+" Combo 3");
//    	System.out.println(+hold4+" Combo 4");
    	

    }

}
