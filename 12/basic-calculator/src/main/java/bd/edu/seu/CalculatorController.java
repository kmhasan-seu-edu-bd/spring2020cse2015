package bd.edu.seu;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculatorController {

    @FXML
    private TextField displayField;

    public CalculatorController() {
        displayField = new TextField();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML // annotation
    private void printText() {
//        String text = displayField.getText();
//        System.out.printf("Hello, %s!", text);
        String text = "Papia";
        displayField.setText(text);
    }

    @FXML
    private void handleOneAction() {
        String oldText = displayField.getText();
        String newText = oldText + "1";
        displayField.setText(newText);
    }
    @FXML
    private void handleTwoAction() {
        String oldText = displayField.getText();
        String newText = oldText + "2";
        displayField.setText(newText);
    }

    @FXML
    private void handleThreeAction() {
        String oldText = displayField.getText();
        String newText = oldText + "3";
        displayField.setText(newText);
    }
}
