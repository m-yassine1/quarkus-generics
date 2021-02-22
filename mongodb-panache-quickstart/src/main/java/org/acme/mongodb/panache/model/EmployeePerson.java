package org.acme.mongodb.panache.model;

import io.quarkus.mongodb.panache.MongoEntity;

import java.math.BigDecimal;

@MongoEntity(collection="TheEmployeePerson")
public class EmployeePerson extends Person {
    public BigDecimal salary;
}
