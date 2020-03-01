package bd.edu.seu;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculatorController {
    private double number1;
    private double number2;
    private String operation;

    @FXML
    private TextField displayField;

    public CalculatorController() {
        displayField = new TextField();
    }

    @FXML // annotation
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

    @FXML
    private void handleFourAction() {
        String oldText = displayField.getText();
        String newText = oldText + "4";
        displayField.setText(newText);
    }

    @FXML
    private void handleFiveAction() {
        String oldText = displayField.getText();
        String newText = oldText + "5";
        displayField.setText(newText);
    }

    @FXML
    private void handleAddAction() {
        // 1) copy the current string as a number and save it to number1
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);

        // 2) clear the display field
        displayField.clear();

        // 3) remember that it's an add action
        operation = "ADD";
    }

    @FXML
    private void handleSubtractAction() {
        // 1) copy the current string as a number and save it to number1
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);

        // 2) clear the display field
        displayField.clear();

        // 3) remember that it's an subtract action
        operation = "SUBTRACT";
    }

    @FXML
    private void handleEqualAction() {
        // 1) copy the current string as a number and save it to number2
        String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);

        // 2) add/subtract number1 and number2 and find the result
        double result = 0;
        switch (operation) {
            case "ADD":
                result = number1 + number2;
                break;

            case "SUBTRACT":
                result = number1 - number2;
                break;
        }

        // 3) display the result as a string in the displayField
        displayField.setText(String.format("%.2f", result));
    }
}
