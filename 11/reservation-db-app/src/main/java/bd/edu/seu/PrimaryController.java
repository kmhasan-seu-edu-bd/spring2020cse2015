package bd.edu.seu;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {
    @FXML private TextField idField;
    @FXML private TextField nameField;
    @FXML private DatePicker fromDatePicker;
    @FXML private DatePicker toDatePicker;
    @FXML private Label statusLabel;

    @FXML private TableView<Reservation> reservationTableView;
    @FXML private TableColumn<Reservation, String> nameColumn;
    @FXML private TableColumn<Reservation, String> fromColumn;
    @FXML private TableColumn<Reservation, String> toColumn;

    private ObservableList<Reservation> reservations;

    private final String DB_URL = "jdbc:mysql://localhost/reservationdb";
    private final String DB_USER = "kmhasan";
    private final String DB_PASS = "toor";

    private Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection okay");
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public PrimaryController() {
        idField = new TextField();
        nameField = new TextField();
        fromDatePicker = new DatePicker();
        toDatePicker = new DatePicker();
        statusLabel = new Label();

        reservationTableView = new TableView<>();
        fromColumn = new TableColumn<>();
        toColumn = new TableColumn<>();

        reservations = FXCollections.observableArrayList();
    }

    @FXML
    private void handleSelectAction() {
        Reservation selectedItem = reservationTableView.getSelectionModel().getSelectedItem();

        showReservationToForm(selectedItem);
    }

    private void showReservationToForm(Reservation reservation) {
        idField.setText("" + reservation.getId());
        nameField.setText(reservation.getName());
        fromDatePicker.setValue(reservation.getFromDate());
        toDatePicker.setValue(reservation.getToDate());
    }

    @FXML
    private void handleReserveAction() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        LocalDate fromDate = fromDatePicker.getValue();
        LocalDate toDate = toDatePicker.getValue();

        Reservation reservation = new Reservation(id, name, fromDate, toDate);

        System.out.println(reservation);

        if (saveToDatabase(reservation) != null) {
            reservations.add(reservation);
            clearForm();
            statusLabel.setText(String.format("Reserved dates %s - %s for %s",
                    reservation.getFromDate().toString(), reservation.getToDate().toString(), reservation.getName()));
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error saving data");
            alert.setContentText(String.format("Could not save reservation for %s", reservation.getName()));

            alert.showAndWait();
        }
    }

    private void clearForm() {
        idField.clear();
        nameField.clear();
        fromDatePicker.setValue(null);
        toDatePicker.setValue(null);
    }

    private Reservation saveToDatabase(Reservation reservation) {
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO reservation VALUES(%d, \"%s\", \"%s\", \"%s\")",
                    reservation.getId(),
                    reservation.getName(),
                    reservation.getFromDate().toString(),
                    reservation.getToDate().toString());
            System.out.println(query);

            statement.executeUpdate(query);
            System.out.println("Reservation inserted");

            return reservation;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public List<Reservation> retrieveData() {
        Connection connection = getConnection();
        List<Reservation> reservationList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM reservation";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String fromDateString = resultSet.getString("fromDate");
                String toDateString = resultSet.getString("toDate");
                Reservation reservation = new Reservation(id,
                        name,
                        LocalDate.parse(fromDateString),
                        LocalDate.parse(toDateString));

                reservationList.add(reservation);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return reservationList;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Connection connection = getConnection();
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        fromColumn.setCellValueFactory(new PropertyValueFactory<>("fromDate"));
        toColumn.setCellValueFactory(new PropertyValueFactory<>("toDate"));

        List<Reservation> reservationList = retrieveData();
        reservations.addAll(reservationList);

        reservationTableView.setItems(reservations);
    }
}
