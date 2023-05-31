package de.throsenheim.gui.threading;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class OracleMain implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(OracleMain.class);
    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField questionInput;
    @FXML
    private Button askButton;
    @FXML
    private Label answerText;

    private OracleModel model = new OracleModel();

    private OracleService service = new OracleService();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        answerText.textProperty().bind(model.answerProperty());

        progressBar.progressProperty().bind(service.progressProperty());
        progressBar.visibleProperty().bind(service.runningProperty());

        service.setOnSucceeded((wse) -> {
            LOGGER.info("setOnSucceeded in thread {}", Thread.currentThread().getName());
            Boolean result = service.getValue();
            model.setResult(result);
        });

        askButton.setOnAction((e) -> {
//            doOracleStuffBlocking(questionInput.getText());
//            doOracleStuffThreadWay(questionInput.getText());
            doOracleStuffJavaFxWay();
        });

    }

    private void doOracleStuffBlocking(String inputText) {
        Boolean result = ask(inputText);
        updateGui(result);
    }

    private void doOracleStuffJavaFxWay() {
        service.restart();
    }

    private void doOracleStuffThreadWay(String text) {
        LOGGER.info("start doOracleStuff in thread {}", Thread.currentThread().getName());


        new Thread(() -> {
            LOGGER.info("start oracle in thread {}", Thread.currentThread().getName());
            Boolean result = ask(text);
            Platform.runLater(() -> {
                LOGGER.info("Updating gui in thread {}", Thread.currentThread().getName());
                updateGui(result);
            });

            LOGGER.info("end oracle in thread {}", Thread.currentThread().getName());
        }).start();


        LOGGER.info("end doOracleStuff in thread {}", Thread.currentThread().getName());

    }

    private void updateGui(Boolean result) {
        model.setResult(result);
    }


    private Boolean ask(String question) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Random().nextBoolean();
    }
}
