package bd.edu.seu;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController implements Initializable {
    @FXML
    private TableView<BankAccount> accountTableView;
    @FXML
    private TableColumn<BankAccount, Number> numberColumn;
    @FXML
    private TableColumn<BankAccount, String> nameColumn;
    @FXML
    private TableColumn<BankAccount, Number> balanceColumn;

    public PrimaryController() {
        accountTableView = new TableView<>();
        numberColumn = new TableColumn<>();
        nameColumn = new TableColumn<>();
        balanceColumn = new TableColumn<>();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //ArrayList<BankAccount> accounts = new ArrayList<>();
        ObservableList<BankAccount> accounts = FXCollections.observableArrayList();
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));

        // dummy data
        // TODO replace this with code that reads from a text file
        accounts.add(new BankAccount(23, "John Doe", 50));
        accounts.add(new BankAccount(33, "Jane Doe", 5));
        accounts.add(new BankAccount(13, "Md. Ashiqur Rahman", 500));

        accountTableView.setItems(accounts);
    }
}
