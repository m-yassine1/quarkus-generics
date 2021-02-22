package org.acme.mongodb.panache.repository.implementation;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import org.acme.mongodb.panache.model.EmployeePerson;
import org.acme.mongodb.panache.repository.PersonRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonEmployeeRepositoryImpl implements PersonRepository<EmployeePerson>, ReactivePanacheMongoRepository<EmployeePerson> {

    @Override
    public Uni<Void> add(EmployeePerson person) {
        return persist(person);
    }
}
