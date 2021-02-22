package org.acme.mongodb.panache.service.implementation;

import org.acme.mongodb.panache.model.TempEmployeePerson;
import org.acme.mongodb.panache.repository.PersonRepository;
import org.acme.mongodb.panache.service.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("sub-employee-person")
@ApplicationScoped
public class PersonTempEmployeeServiceImpl implements PersonService<TempEmployeePerson> {

    @Inject
    PersonRepository<TempEmployeePerson> personRepository;

    @Override
    public PersonRepository<TempEmployeePerson> getRepository() {
        return personRepository;
    }
}
