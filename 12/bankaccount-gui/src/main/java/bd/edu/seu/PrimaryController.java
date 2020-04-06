package bd.edu.seu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {
    private BankAccountsService bankAccountsService;
    private ObservableList<BankAccount> accounts;

    @FXML
    private TableView<BankAccount> accountTableView;
    @FXML
    private TableColumn<BankAccount, Number> numberColumn;
    @FXML
    private TableColumn<BankAccount, String> nameColumn;
    @FXML
    private TableColumn<BankAccount, String> addressColumn;
    @FXML
    private TableColumn<BankAccount, Number> balanceColumn;

    @FXML
    private TextField numberField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField balanceField;

    @FXML
    public void handleSaveAction() {
        // Step 1: Read from the form
        int id = Integer.parseInt(numberField.getText());
        String name = nameField.getText();
        String address = addressField.getText();
        double balance = Double.parseDouble(balanceField.getText());

        // Step 2: Create an object of BankAccount type
        BankAccount bankAccount = new BankAccount(id, name, address, balance);

        // Step 3: Add to the TableView
        accounts.add(bankAccount);

        // Step 4: Write to the file
        bankAccountsService.writeBankAccounts("accounts.txt", accounts);

        // Step 5: Clear the form
        numberField.clear();
        nameField.clear();
        addressField.clear();
        balanceField.clear();

        // Step 6: Inform the user
        // TODO HW inform the user by using some dialog https://code.makery.ch/blog/javafx-dialogs-official/
    }

    public PrimaryController() {
        // the job of a constructor for a JavaFX controller
        // is to make sure that all the controls are instantiated
        accountTableView = new TableView<>();
        nameColumn = new TableColumn<>();
        numberColumn = new TableColumn<>();
        addressColumn = new TableColumn<>();
        balanceColumn = new TableColumn<>();

        numberField = new TextField();
        nameField = new TextField();
        addressField = new TextField();
        balanceField = new TextField();

        bankAccountsService = new BankAccountsService();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts = FXCollections.observableArrayList();

        // read all the bank accounts from accounts.txt
        List<BankAccount> accountList = bankAccountsService.readBankAccounts("accounts.txt");
        accounts.addAll(accountList);

        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));

        accountTableView.setItems(accounts);
    }
}
