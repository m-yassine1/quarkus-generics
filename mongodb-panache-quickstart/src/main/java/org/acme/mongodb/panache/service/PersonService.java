package org.acme.mongodb.panache.service;

import io.smallrye.mutiny.Uni;
import org.acme.mongodb.panache.model.Person;
import org.acme.mongodb.panache.repository.PersonRepository;

public interface PersonService<T extends Person> {
    PersonRepository<T> getRepository();
    default Uni<Void> add(T person) {
        return getRepository().add(person);
    }
}
