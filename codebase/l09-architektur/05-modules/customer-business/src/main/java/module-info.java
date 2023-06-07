import de.throsenheim.gui.architektur.exercise.customer.business.domain.CustomerStore;
import de.throsenheim.gui.architektur.exercise.customer.business.impl.CustomerServiceImpl;
import de.throsenheim.gui.architektur.exercise.customer.business.api.CustomerService;

module de.throsenheim.gui.architektur.exercise.customer.business {
    exports de.throsenheim.gui.architektur.exercise.customer.business.api;
    exports de.throsenheim.gui.architektur.exercise.customer.business.domain;

    provides CustomerService with CustomerServiceImpl;

    uses CustomerStore;
}

