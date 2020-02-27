package bd.edu.seu;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    public PrimaryController() {
        aField = new TextField();
        bField = new TextField();
    }

    @FXML
    private void switchToSecondary() throws IOException {
//        App.setRoot("secondary");
        System.out.printf("Hello [%s]\n", aField.getText());
    }

    @FXML
    private void copyText() {
        String aString = aField.getText();
        bField.setText(aString);
        System.out.printf("[%s]\n", aString);
    }
}
