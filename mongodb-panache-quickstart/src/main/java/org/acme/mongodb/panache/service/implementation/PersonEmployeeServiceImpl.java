package org.acme.mongodb.panache.service.implementation;

import org.acme.mongodb.panache.model.EmployeePerson;
import org.acme.mongodb.panache.repository.PersonRepository;
import org.acme.mongodb.panache.service.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("employee-person")
@ApplicationScoped
public class PersonEmployeeServiceImpl implements PersonService<EmployeePerson> {
    @Inject
    PersonRepository<EmployeePerson> personRepository;

    @Override
    public PersonRepository<EmployeePerson> getRepository() {
        return personRepository;
    }
}
