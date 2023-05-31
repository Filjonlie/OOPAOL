package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ScnController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	@FXML
    private TextField username;
	
	@FXML
    private TextField password;

    @FXML
    void click(ActionEvent event) throws IOException{
    	//FXMLLoader loader = new FXMLLoader(getClass().getResource("Scn2.fxml"));
    	root = FXMLLoader.load(getClass().getResource("Scn2.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    			

    }

}
