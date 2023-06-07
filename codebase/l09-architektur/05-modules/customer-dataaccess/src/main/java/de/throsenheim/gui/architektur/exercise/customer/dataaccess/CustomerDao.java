package de.throsenheim.gui.architektur.exercise.customer.dataaccess;

import de.throsenheim.gui.architektur.exercise.customer.business.domain.CustomerEt;
import de.throsenheim.gui.architektur.exercise.customer.business.domain.CustomerStore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CustomerDao implements CustomerStore {

    public Set<CustomerEt> findCustomers(String name) {
        return new HashSet<>(Arrays.asList(
                new CustomerEt("Hans", "Dampf"),
                new CustomerEt("Dörthe", "Müller")
        ));
    }
}
