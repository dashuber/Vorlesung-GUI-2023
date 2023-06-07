package de.throsenheim.gui.architektur.exercise.customer.business.domain;

import java.util.Set;

public interface CustomerStore {
    Set<CustomerEt> findCustomers(String name);
}
