package org.acme.mongodb.panache;

import org.acme.mongodb.panache.model.EmployeePerson;
import org.acme.mongodb.panache.service.PersonService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/persons")
public class PersonEmployeeResource {

    @Inject
    @Named("employee-person")
    PersonService<EmployeePerson> personEmployeeService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}