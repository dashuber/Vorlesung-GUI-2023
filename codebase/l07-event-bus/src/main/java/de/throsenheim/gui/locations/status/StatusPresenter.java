package de.throsenheim.gui.locations.status;

import de.throsenheim.gui.locations.eventbus.SimpleEventBus;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class StatusPresenter implements Initializable {
    @FXML
    private Text statusText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SimpleEventBus.getEventBus().subscribe(StatusEvent.class, event -> {
            this.statusText.setText(((StatusEvent) event).getMessage());
        });
    }
}
