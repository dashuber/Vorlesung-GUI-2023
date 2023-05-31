/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v07.paraellelitaet.regularthread;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * FXML Controller class
 *
 * @author dominik.haas
 */
public class SlowCalculatorController implements Initializable {

    @FXML
    private Label resultLabel;

    @FXML
    private Button goButton;

    @FXML
    private Button resetButton;

    private static final Logger LOGGER = LoggerFactory.getLogger(SlowCalculatorController.class);



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // data binding


        // event handler

    }

    private void updateUi(String result) {
        //model.setResult(result);
    }

    private String calculate() {
        //todo

        return null;
    }

}
