package org.acme.mongodb.panache;ass class org.acme.mongodb.panache.PersonEmployeeResourceTest

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.acme.mongodb.panache.model.EmployeePerson;
import org.acme.mongodb.panache.service.PersonService;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PersonEmployeeResourceTest {

    @InjectMock
    PersonService<EmployeePerson> personEmployeeService;

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/persons")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}