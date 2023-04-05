package v4.mvp;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author haas
 */
public class IntervalPresenter implements Initializable {

    public Button buttonUp;
    public Button buttonDown;
    public ProgressBar valueProgressbar;
    public TextField valueTextField;

    private final IntervalModel intervalModel = new IntervalModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        valueProgressbar.progressProperty().bind(intervalModel.intervalValueProperty().divide(10d));
        valueTextField.textProperty().bind(intervalModel.intervalValueProperty().asString());

        buttonUp.setOnAction(event -> intervalModel.increaseValue());

        buttonDown.addEventHandler(ActionEvent.ANY, event -> intervalModel.decreaseValue());

        buttonDown.disableProperty().bind(intervalModel.minReached());
        buttonUp.disableProperty().bind(intervalModel.maxReached());
    }
}
