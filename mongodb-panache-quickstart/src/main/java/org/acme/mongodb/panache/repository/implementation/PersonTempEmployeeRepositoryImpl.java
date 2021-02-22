package org.acme.mongodb.panache.repository.implementation;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoRepository;
import io.smallrye.mutiny.Uni;
import org.acme.mongodb.panache.model.EmployeePerson;
import org.acme.mongodb.panache.model.TempEmployeePerson;
import org.acme.mongodb.panache.repository.PersonRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonTempEmployeeRepositoryImpl implements PersonRepository<TempEmployeePerson>, ReactivePanacheMongoRepository<TempEmployeePerson> {

    @Override
    public Uni<Void> add(TempEmployeePerson person) {
        return persist(person);
    }
}
