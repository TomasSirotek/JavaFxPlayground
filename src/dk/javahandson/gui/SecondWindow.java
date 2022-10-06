package dk.javahandson.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SecondWindow {

    @FXML
    private TextField input;
    @FXML
    private Label labelText;

    private MainController controller;


    @FXML
    public void setLabel(String name){
        labelText.setText(name);
    }

    public void setParentController(MainController controller){
        this.controller = controller;
    }

    public void sendData(ActionEvent event) {
        // SENDING THE DATA BACK TO THE MAIN CONTROLLER
        controller.sendData(input.getText());
        // CLOSE WINDOW AFTER
        Node n  = (Node) event.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }
}
