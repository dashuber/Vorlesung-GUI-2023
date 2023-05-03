package de.throsenheim.gui.locations;

import de.throsenheim.gui.locations.eventbus.EventBus;
import de.throsenheim.gui.locations.eventbus.SimpleEventBus;
import de.throsenheim.gui.locations.location.LocationModel;
import de.throsenheim.gui.locations.locationform.LocationFormPresenter;
import de.throsenheim.gui.locations.status.StatusEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Arrays;
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
        LOGGER.info("Received save event in parent");
        //add the current location to the list
        model.addLocation(location);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        locationsTable.itemsProperty().bind(model.locationsProperty());
        locationFormController.setLocation(new LocationModel());
        locationFormController.setSaveListener(this::saveLocation);

        populateListWithData();

        SimpleEventBus.getEventBus().publish(new StatusEvent("All locations loaded!"));
    }

    private void populateListWithData() {
        model.addLocations(Arrays.asList(
                new LocationModel("Schlawinchen", "Pub", "Boazn"),
                new LocationModel("Iron Works Barbecue", "Restuarant", "Barbecue")
        ));
    }
}
