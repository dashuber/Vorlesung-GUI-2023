/*
 * _____________________________________________________________________________
 *
 *           Project:    GUI 2015
 * _____________________________________________________________________________
 *
 *        Created by:    Johannes Weigend, QAware GmbH
 *     Creation date:    March - July 2015
 * _____________________________________________________________________________
 *
 *         Copyright:    Hochschule Rosenheim
 * _____________________________________________________________________________
 */
package de.fhro.gui.v3.login;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordInput;
    @FXML
    private TextField userInput;


    public LoginController() {
        LOGGER.info("Constructor LoginController");
        LOGGER.info("UserInput: {}", userInput);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOGGER.info("Initialize LoginController");
        LOGGER.info("UserInput: {}", userInput);

        loginButton.addEventHandler(ActionEvent.ANY, event -> {
            LOGGER.info("Login button pressed");
        });

        userInput.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                LOGGER.info("User input: {}", event.getText());
            }
        });
    }


    @FXML
    private void doLogin(ActionEvent actionEvent) {
        // Stupid example, never ever log passwords
        LOGGER.info("doLogin {}:{}", userInput.getText(), passwordInput.getText());
    }

}
