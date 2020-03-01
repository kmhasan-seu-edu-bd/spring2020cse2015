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

    @FXML
    private void handleAddAction() {
        // 1) copy the current string as a number and save
        // it to number1
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);

        // 2) clear the displayField
        displayField.clear();

        // 3) remember that we are supposed to add
        operation = "ADD";
    }

    @FXML
    private void handleSubtractAction() {
        // 1) copy the current string as a number and save
        // it to number1
        String oldText = displayField.getText();
        number1 = Double.parseDouble(oldText);

        // 2) clear the displayField
        displayField.clear();

        // 3) remember that we are supposed to subtract
        operation = "SUBTRACT";
    }

    @FXML
    private void handleEqualAction() {
        // 1) copy the current string as a number to number2
        String oldText = displayField.getText();
        number2 = Double.parseDouble(oldText);

        // 2) add number1 and number2
        double result = 0;
        switch (operation) {
            case "ADD":
                result = number1 + number2;
                break;
            case "SUBTRACT":
                result = number1 - number2;
                break;
        }
        //number1 + number2;

        // 3) display the result as a String
        String newText = String.format("%.2f", result);
        displayField.setText(newText);
    }
}




