package dk.javahandson.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class MainController {
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private TextField txtInput;
    @FXML
    private Label lbl;

    @FXML
    private void clickBtn(ActionEvent actionEvent) {
        lbl.setText("Button");
    }
    @FXML
    private void changeLabel(ActionEvent actionEvent) {
        String input = txtInput.getText();
        if(!input.isEmpty()){
            lbl.setText(input);
        } else {
            lbl.setText("Its empty");
        }

    }

    @FXML
    private void changeColor(ActionEvent actionEvent) {
        Color color = colorPicker.getValue();
        lbl.setTextFill(color);
    }

    @FXML
    private void openWindow(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/SecondWindow.fxml"));
        Parent root = loader.load();
        SecondWindow secondWindow = loader.getController();
        secondWindow.setLabel("Ahoj");
        secondWindow.setParentController(this);
        Stage stage = new Stage();
        stage.setTitle("Second window");
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void changeWindow(String fxmlFile) throws IOException {

    }

    public void sendData(String text) {
      lbl.setText(text);
    }
}
