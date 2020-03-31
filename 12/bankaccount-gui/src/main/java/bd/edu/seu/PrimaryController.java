package bd.edu.seu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {
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

    public PrimaryController() {
        // the job of a constructor for a JavaFX controller
        // is to make sure that all the controls are instantiated
        accountTableView = new TableView<>();
        nameColumn = new TableColumn<>();
        numberColumn = new TableColumn<>();
        addressColumn = new TableColumn<>();
        balanceColumn = new TableColumn<>();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //ArrayList<BankAccount> accounts = new ArrayList<>();
        ObservableList<BankAccount> accounts = FXCollections.observableArrayList();

        // TODO replace the following four lines with file reading code
        // read all the bank accounts from accounts.txt
        accounts.add(new BankAccount(54, "John Doe", "Banani", 50));
        accounts.add(new BankAccount(14, "Jane Doe", "Uttara", 5));
        accounts.add(new BankAccount(18, "Abdullah Bin Faruq", "Baridhara", 500));
        accounts.add(new BankAccount(10, "Ferdowsi Marufa", "Nikunja", 50000));

        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));

        accountTableView.setItems(accounts);
    }
}
