/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v07.paraellelitaet.javafx;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import v07.paraellelitaet.regularthread.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import v07.paraellelitaet.regularthread.SlowCalculatorModel;

/**
 * FXML Controller class
 *
 * @author dominik.haas
 */
public class SlowCalculatorController implements Initializable {

    @FXML
    private Label resultLabel;
    
    @FXML
    private Label statusLabel;
    @FXML
    ProgressBar progress;

    @FXML
    private Button goButton;

    @FXML
    private Button resetButton;





    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        goButton.setOnAction((e) -> {

        });

        resetButton.setOnAction((e) -> {

        });

        //result binding or setOnSucceeded


        //data binding
    }

}
