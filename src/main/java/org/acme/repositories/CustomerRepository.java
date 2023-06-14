package org.acme.repositories;

import org.acme.model.Customer;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * @author pedroRhamon
 */
@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer>{

}
