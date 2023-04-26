package de.throsenheim.gui.locations;

import de.throsenheim.gui.locations.locationform.LocationFormPresenter;
import de.throsenheim.gui.locations.locationform.MyCustomListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LocationsMainPresenter implements Initializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationsMainPresenter.class);

    @FXML
    private Pane locationForm;
    @FXML
    private LocationFormPresenter locationFormController;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOGGER.info(String.valueOf(locationForm));
        locationFormController.foo("Hello world");

        locationFormController.registerListener(new MyCustomListener() {
            @Override
            public void onFoo(String message) {
                LOGGER.info("got message from child: " + message);
            }
        });
    }
}
