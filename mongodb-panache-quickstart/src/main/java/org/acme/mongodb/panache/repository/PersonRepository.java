package org.acme.mongodb.panache.repository;

import io.smallrye.mutiny.Uni;
import org.acme.mongodb.panache.model.Person;

public interface PersonRepository<T extends Person> {
    Uni<Void> add(T person);
}
