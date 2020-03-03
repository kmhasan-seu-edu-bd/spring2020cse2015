package bd.edu.seu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SecondaryController implements Initializable {
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField balanceField;
    @FXML
    private TextField amountField;

    public SecondaryController() {
        idField = new TextField();
        nameField = new TextField();
        balanceField = new TextField();
        amountField = new TextField();
    }

    @FXML
    private void handleWithdrawAction() throws IOException {
    }

    @FXML
    private void handleDepositAction() throws IOException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BankAccount bankAccount = App.getCurrentBankAccount();
        idField.setText(String.format("%d", bankAccount.getId()));
        nameField.setText(bankAccount.getName());
        balanceField.setText(String.format("%.2f", bankAccount.getBalance()));
    }
}