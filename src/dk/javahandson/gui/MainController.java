package dk.javahandson.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.awt.*;

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
}
