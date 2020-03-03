package bd.edu.seu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
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
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String address = addressArea.getText();
        double balance = Double.parseDouble(balanceField.getText());

        BankAccount bankAccount = new BankAccount(id, name, address, balance);

        App.setCurrentBankAccount(bankAccount);

        System.out.println(bankAccount);

        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idField.setText("8745");
        nameField.setText("Md. Ashiqur Rahman");
        addressArea.setText("Room 1203\n24, Kemal Ataturk Avenue\nBanani");
        balanceField.setText("50000");
    }
}
