import de.throsenheim.gui.architektur.exercise.customer.business.domain.CustomerStore;
import de.throsenheim.gui.architektur.exercise.customer.dataaccess.CustomerDao;

module de.throsenheim.gui.architektur.exercise.customer.dataaccess {
    requires de.throsenheim.gui.architektur.exercise.customer.business;

    provides CustomerStore with CustomerDao;
}

