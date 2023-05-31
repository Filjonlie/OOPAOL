package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckoutController {
	@FXML
    private Text OrderText;
	@FXML
    private Text a;

    @FXML
    private Text b;

    @FXML
    private Text c;

    @FXML
    private Text d;
    @FXML
    private Button confirm;
    private Stage stage;
   	private Scene scene;
   	private Parent root;
	
	public void display(int x, int y, int z, int v) {
		a.setText(x+"x Combo 1");
		b.setText(y+"x Combo 2");
		c.setText(z+"x Combo 3");
		d.setText(v+"x Combo 4");
	}
	
	public void next(ActionEvent event) throws IOException{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ThankYou.fxml"));
    	root = loader.load();
	    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}
	



}
