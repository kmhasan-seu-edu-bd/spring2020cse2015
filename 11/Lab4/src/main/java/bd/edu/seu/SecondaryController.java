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

    private BankAccount bankAccount;

    // constructor gets called first
    // make sure that your UI controls are instantiated
    public SecondaryController() {
        idField = new TextField();
        nameField = new TextField();
        balanceField = new TextField();
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    // initialize gets called after the constructor is done
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // load back the bank account from the App class
        bankAccount = App.getCurrentBankAccount();

        String idText = String.format("%d", bankAccount.getId());
        String nameText = bankAccount.getName();
        String balanceText = String.format("%.2f", bankAccount.getBalance());

        idField.setText(idText);
        nameField.setText(nameText);
        balanceField.setText(balanceText);
    }
}