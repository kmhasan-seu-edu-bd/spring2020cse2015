package bd.edu.seu;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField balanceField;
    @FXML
    private TextArea addressArea;

    public PrimaryController() {
        idField = new TextField();
        nameField = new TextField();
        balanceField = new TextField();
        addressArea = new TextArea();
    }

    @FXML
    private void handleCreateAction() throws IOException {

        String idText = idField.getText();
        int id = Integer.parseInt(idText);
        String name = nameField.getText();
        String address = addressArea.getText();
        String balanceText = balanceField.getText();
        double balance = Double.parseDouble(balanceText);

        // Create the bank account based on user input
        BankAccount bankAccount = new BankAccount(id, name, address, balance);

        System.out.println(bankAccount);

        App.setCurrentBankAccount(bankAccount);

        App.setRoot("secondary");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
