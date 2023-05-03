package de.throsenheim.gui.locations;

import de.throsenheim.gui.locations.location.LocationModel;
import de.throsenheim.gui.locations.locationform.LocationFormPresenter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller/presenter for the locations main dialog
 */
public class LocationsMainPresenter implements Initializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(LocationsMainPresenter.class);

    @FXML
    private TableView<LocationModel> locationsTable;
    @FXML
    private LocationFormPresenter locationFormController;

    private final LocationsMainModel model = new LocationsMainModel();



    private void saveLocation(LocationModel location) {
        LOGGER.info("safeEvent");
        //add the current location to the list
        model.addLocation(location);
        //set up a new one
        locationFormController.setLocation(new LocationModel());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //register save listener - component interaction
        locationFormController.addSaveListener(this::saveLocation);

        //ui bindings - display events in table
        locationsTable.itemsProperty().bind(model.locationsProperty());
    }
}
